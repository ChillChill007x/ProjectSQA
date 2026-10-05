package com.fasterxml.jackson.databind.deser.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v2 = ((com.fasterxml.jackson.databind.deser.impl.SetterlessProperty)v0).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getValueDeserializer();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).visibleInView(((java.lang.Class)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).getObjectIdInfo();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = -3;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).assignIndex((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "serialization type ";
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).setManagedReferenceName(((java.lang.String)v22));
    Object v23 = null;
    Object v24 = 0;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).assignIndex((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).toString();
    Object v23 = 1L;
    Object v24 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v23).longValue()));
    Object v25 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v26 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v25));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v24),((com.fasterxml.jackson.core.ObjectCodec)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).deserialize(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).markAsIgnorable();
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getWrapperName();
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = 1L;
    Object v23 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v22).longValue()));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v23),((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v26),((com.fasterxml.jackson.databind.DeserializationContext)v29),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
    Object v25 = 1L;
    Object v26 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v25).longValue()));
    Object v27 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v28 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26),((com.fasterxml.jackson.core.ObjectCodec)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v34 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v32),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = 1L;
    Object v23 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v22).longValue()));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v23),((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).deserialize(((com.fasterxml.jackson.core.JsonParser)v26),((com.fasterxml.jackson.databind.DeserializationContext)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = -8;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = "+000";
    Object v27 = "r";
    Object v28 = ((com.fasterxml.jackson.databind.SerializerProvider)v23).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v25),((java.lang.String)v26),((java.lang.String)v27));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getPropertyIndex();
    org.junit.Assert.assertEquals((Object)(-1), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).setViews(((java.lang.Class[])v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).getMetadata();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withName(((com.fasterxml.jackson.databind.PropertyName)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getInjectableValueId();
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new java.lang.Class[]{};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).setViews(((java.lang.Class[])v22));
    Object v23 = null;
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getMember();
    Object v23 = 0;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).assignIndex((((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withName(((com.fasterxml.jackson.databind.PropertyName)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getValueDeserializer();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getFullName();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getContextAnnotation(((java.lang.Class)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.BeanProperty)v21).getMember();
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v22));
    Object v24 = "base64";
    Object v25 = ((java.lang.Class)v23).getResource(((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).visibleInView(((java.lang.Class)v23));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20).withAlwaysAsId((((java.lang.Boolean)v21).booleanValue()));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).setViews(((java.lang.Class[])v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = 1L;
    Object v23 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v22).longValue()));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v23),((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v31 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v26),((com.fasterxml.jackson.databind.DeserializationContext)v29),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getPropertyIndex();
    org.junit.Assert.assertEquals((Object)(-1), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).getInjectableValueId();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v19));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).visibleInView(((java.lang.Class)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getMember();
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).isIgnorable();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getObjectIdInfo();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1L;
    Object v2 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v1).longValue()));
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = -8;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = ")";
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v11));
    Object v13 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v13));
    ((com.fasterxml.jackson.databind.deser.impl.SetterlessProperty)v0).deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = 1;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).assignIndex((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getName();
    org.junit.Assert.assertEquals((Object)("[anySetter]"), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getName();
    org.junit.Assert.assertEquals((Object)("FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY"), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getNullValueProvider();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getManagedReferenceName();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).setViews(((java.lang.Class[])v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = 1L;
    Object v23 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v22).longValue()));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v23),((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = "null";
    Object v31 = ((com.fasterxml.jackson.databind.DeserializationContext)v29).mappingException(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v32));
    Object v34 = true;
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v26),((com.fasterxml.jackson.databind.DeserializationContext)v29),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getMember();
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getValueDeserializer();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getValueDeserializer();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getMember();
    Object v20 = 1L;
    Object v21 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v20).longValue()));
    Object v22 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    Object v28 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v27).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v28));
    Object v29 = null;
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).deserialize(((com.fasterxml.jackson.core.JsonParser)v24),((com.fasterxml.jackson.databind.DeserializationContext)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = 25;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).assignIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ":";
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).setManagedReferenceName(((java.lang.String)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getValueTypeDeserializer();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -8;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v9 = null;
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.PropertyName)v4),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v9),((com.fasterxml.jackson.annotation.ObjectIdResolver)v10));
    Object v12 = false;
    Object v13 = ":";
    Object v14 = -41;
    Object v15 = "] that wasn't previously seen as unresolved.";
    Object v16 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v12),((java.lang.String)v13),((java.lang.Integer)v14),((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v11),((com.fasterxml.jackson.databind.PropertyMetadata)v16));
    Object v18 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v17),((com.fasterxml.jackson.databind.PropertyName)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v22).getNullValueProvider();
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.SetterlessProperty)v0).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v18).isVirtual();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.BeanProperty)v18).getType();
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v18).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v19));
    Object v21 = ((java.lang.Class)v20).getEnumConstants();
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).visibleInView(((java.lang.Class)v20));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).setViews(((java.lang.Class[])v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).getValueTypeDeserializer();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).withName(((com.fasterxml.jackson.databind.PropertyName)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).toString();
    Object v23 = new java.lang.Class[]{null,null,null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).setViews(((java.lang.Class[])v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v19),((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getNullValueProvider();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).getCreatorIndex();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).toString();
    org.junit.Assert.assertEquals((Object)("[property 'FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY']"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v22));
    Object v23 = null;
    Object v24 = 1;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).assignIndex((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).getValueDeserializer();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).isVirtual();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getManagedReferenceName();
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getAnnotation(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getObjectIdInfo();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "string";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "typ";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "typ";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).getValueDeserializer();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "typ";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).visibleInView(((java.lang.Class)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "string";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).visibleInView(((java.lang.Class)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = 1L;
    Object v23 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v22).longValue()));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v23),((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = null;
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v30),((com.fasterxml.jackson.databind.type.TypeBindings)v31));
    Object v33 = null;
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v32),((java.lang.reflect.Field)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v26),((com.fasterxml.jackson.databind.DeserializationContext)v29),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1L;
    Object v2 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v1).longValue()));
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = true;
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v10),(((java.lang.Boolean)v11).booleanValue()));
    ((com.fasterxml.jackson.databind.deser.impl.SetterlessProperty)v0).deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Object)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "typ";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = 1L;
    Object v25 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v24).longValue()));
    Object v26 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v27 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v26));
    Object v28 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v25),((com.fasterxml.jackson.core.ObjectCodec)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v28),((com.fasterxml.jackson.databind.DeserializationContext)v31),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "typ";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v24),((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v27));
    Object v29 = ((java.lang.Class)v28).getSimpleName();
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).visibleInView(((java.lang.Class)v28));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = 1L;
    Object v21 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v20).longValue()));
    Object v22 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19).deserialize(((com.fasterxml.jackson.core.JsonParser)v24),((com.fasterxml.jackson.databind.DeserializationContext)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getObjectIdInfo();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "string";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1L;
    Object v2 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v1).longValue()));
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.SetterlessProperty)v0).deserializeSetAndReturn(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "typ";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = "moduleName";
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).withSimpleName(((java.lang.String)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "string";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getCreatorIndex();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "string";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getMember();
    Object v20 = 1L;
    Object v21 = new com.fasterxml.jackson.databind.node.LongNode((((java.lang.Long)v20).longValue()));
    Object v22 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).deserialize(((com.fasterxml.jackson.core.JsonParser)v24),((com.fasterxml.jackson.databind.DeserializationContext)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "r";
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).setManagedReferenceName(((java.lang.String)v22));
    Object v23 = null;
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "typ";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v23).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getCreatorIndex();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "[anySetter]";
    Object v18 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v20).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = "typ";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.BeanProperty)v23).getName();
    Object v25 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v23).getMetadata();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = -8;
    Object v1 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v0).intValue()));
    Object v2 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer();
    Object v8 = null;
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8),((com.fasterxml.jackson.annotation.ObjectIdResolver)v9));
    Object v11 = false;
    Object v12 = ":";
    Object v13 = -41;
    Object v14 = "] that wasn't previously seen as unresolved.";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v11),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v10),((com.fasterxml.jackson.databind.PropertyMetadata)v15));
    Object v17 = "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20));
    Object v22 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).setViews(((java.lang.Class[])v22));
    Object v23 = null;
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }
}
