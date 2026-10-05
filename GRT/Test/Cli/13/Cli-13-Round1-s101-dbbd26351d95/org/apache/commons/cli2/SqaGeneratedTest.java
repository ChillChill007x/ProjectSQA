package org.apache.commons.cli2;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.CommandLine)v6).hasOption(((org.apache.commons.cli2.Option)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = ((org.apache.commons.cli2.CommandLine)v6).getOptionTriggers();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "-";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getOption(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.Option)v10).getTriggers();
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((org.apache.commons.cli2.Option)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Missing.option";
    Object v35 = ((org.apache.commons.cli2.WriteableCommandLine)v33).looksLikeOption(((java.lang.String)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((org.apache.commons.cli2.Option)v10));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getOptionTriggers();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = " (";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getProperty(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Missi";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "ArgumentBuilder.null.n4ame";
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v7),((java.lang.Boolean)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Enum.illegal.value";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = ((org.apache.commons.cli2.CommandLine)v6).getOptions();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Optionmissing.required";
    Object v8 = "Miss8ing.option";
    Object v9 = "\"";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 32;
    Object v13 = new java.util.Properties((((java.lang.Integer)v12).intValue()));
    Object v14 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v11),((java.util.Properties)v13));
    Object v15 = ((org.apache.commons.cli2.CommandLine)v14).getOptions();
    Object v16 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((java.lang.String)v7),((java.util.List)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((org.apache.commons.cli2.Option)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Miss8ing.option";
    Object v35 = "\"";
    Object v36 = 0;
    Object v37 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v34),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()));
    Object v38 = true;
    ((org.apache.commons.cli2.WriteableCommandLine)v33).setDefaultSwitch(((org.apache.commons.cli2.Option)v37),((java.lang.Boolean)v38));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Switch.disabled.startsWith.enabled";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).hasOption(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Miss8ing.option";
    Object v35 = "\"";
    Object v36 = 0;
    Object v37 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v34),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()));
    Object v38 = ((org.apache.commons.cli2.WriteableCommandLine)v33).getUndefaultedValues(((org.apache.commons.cli2.Option)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.Option)v10).isRequired();
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((org.apache.commons.cli2.Option)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).hasOption(((java.lang.String)v7));
    Object v9 = "Une4pected.token";
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v9),((java.lang.Boolean)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.Option)v10).getPrefixes();
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).hasOption(((org.apache.commons.cli2.Option)v10));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((org.apache.commons.cli2.Option)v10),((java.lang.Boolean)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Miss8ing.option";
    Object v12 = "\"";
    Object v13 = 0;
    Object v14 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = 32;
    Object v16 = new java.util.Properties((((java.lang.Integer)v15).intValue()));
    Object v17 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v14),((java.util.Properties)v16));
    Object v18 = "Miss8ing.option";
    Object v19 = "\"";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.Option)v21).isRequired();
    Object v23 = ((org.apache.commons.cli2.CommandLine)v17).getValues(((org.apache.commons.cli2.Option)v21));
    Object v24 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((org.apache.commons.cli2.Option)v10),((java.util.List)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((org.apache.commons.cli2.Option)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = ((org.apache.commons.cli2.CommandLine)v6).getProperties();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Miss8ing.option";
    Object v35 = "\"";
    Object v36 = 0;
    Object v37 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v34),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()));
    Object v38 = true;
    ((org.apache.commons.cli2.WriteableCommandLine)v33).addSwitch(((org.apache.commons.cli2.Option)v37),(((java.lang.Boolean)v38).booleanValue()));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Switch.enabled.startsWith.disabled";
    Object v8 = "ClassValidator.class.notfound";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getProperty(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.cli2.CommandLine)v6).getOptions();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.CommandLine)v6).getOptionCount(((org.apache.commons.cli2.Option)v10));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = " ](";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getProperty(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "ClassValidator.class.notfound";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "\"";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getOptionCount(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((org.apache.commons.cli2.Option)v10),((java.lang.Boolean)v11));
    Object v13 = "-";
    Object v14 = ((org.apache.commons.cli2.CommandLine)v6).getOption(((java.lang.String)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = -13;
    Object v12 = "Miss8ing.option";
    Object v13 = "\"";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 32;
    Object v17 = new java.util.Properties((((java.lang.Integer)v16).intValue()));
    Object v18 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v15),((java.util.Properties)v17));
    Object v19 = "Miss8ing.option";
    Object v20 = "\"";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.cli2.CommandLine)v18).getValues(((org.apache.commons.cli2.Option)v22));
    Object v24 = ((org.apache.commons.cli2.CommandLine)v18).getOptionTriggers();
    Object v25 = org.apache.commons.cli2.util.Comparators.preferredNameFirst();
    Object v26 = ((org.apache.commons.cli2.Option)v10).helpLines((((java.lang.Integer)v11).intValue()),((java.util.Set)v24),((java.util.Comparator)v25));
    Object v27 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((org.apache.commons.cli2.Option)v10));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((org.apache.commons.cli2.Option)v10),((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Opion.illegal.enabled.prefix";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Miss8ing.option";
    Object v35 = "\"";
    Object v36 = 0;
    Object v37 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v34),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()));
    Object v38 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    ((org.apache.commons.cli2.WriteableCommandLine)v33).addValue(((org.apache.commons.cli2.Option)v37),((java.lang.Object)v38));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((org.apache.commons.cli2.Option)v10),((java.lang.Boolean)v11));
    Object v13 = " (";
    Object v14 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((org.apache.commons.cli2.Option)v10),((java.lang.Boolean)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "DateValidator.date.OutOf0Range";
    Object v35 = ((org.apache.commons.cli2.WriteableCommandLine)v33).looksLikeOption(((java.lang.String)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.CommandLine)v6).hasOption(((org.apache.commons.cli2.Option)v10));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getOptionTriggers();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "t]rue";
    Object v8 = "Miss8ing.option";
    Object v9 = "\"";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 32;
    Object v13 = new java.util.Properties((((java.lang.Integer)v12).intValue()));
    Object v14 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v11),((java.util.Properties)v13));
    Object v15 = "Switch.enabled.startsWith.disabled";
    Object v16 = "ClassValidator.class.notfound";
    Object v17 = ((org.apache.commons.cli2.CommandLine)v14).getProperty(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.cli2.CommandLine)v14).getOptions();
    Object v19 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((java.lang.String)v7),((java.util.List)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "-";
    Object v35 = ((org.apache.commons.cli2.WriteableCommandLine)v33).looksLikeOption(((java.lang.String)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = ((org.apache.commons.cli2.CommandLine)v6).getOptions();
    Object v8 = "Option.mising.required";
    Object v9 = "Argument.missing.values";
    Object v10 = ((org.apache.commons.cli2.CommandLine)v6).getProperty(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("Argument.missing.values"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.Option)v10).isRequired();
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((org.apache.commons.cli2.Option)v10));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Miss8ing.option";
    Object v35 = "\"";
    Object v36 = 0;
    Object v37 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v34),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()));
    Object v38 = false;
    ((org.apache.commons.cli2.WriteableCommandLine)v33).setDefaultSwitch(((org.apache.commons.cli2.Option)v37),((java.lang.Boolean)v38));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = new byte[]{Byte.valueOf((byte)0)};
    Object v20 = new java.io.ByteArrayInputStream(((byte[])v19));
    Object v21 = java.util.Set.of(((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18),((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((org.apache.commons.cli2.Option)v10),((java.lang.Object)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "";
    Object v35 = ((org.apache.commons.cli2.WriteableCommandLine)v33).looksLikeOption(((java.lang.String)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = ":";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).hasOption(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Miss8ing.option";
    Object v35 = "\"";
    Object v36 = 0;
    Object v37 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v34),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()));
    Object v38 = false;
    ((org.apache.commons.cli2.WriteableCommandLine)v33).addSwitch(((org.apache.commons.cli2.Option)v37),(((java.lang.Boolean)v38).booleanValue()));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "DISPLAY_SWITCH_ENABLED";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getOption(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Argument.unexpected.value";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getOptionCount(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "a";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getOption(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Un";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getOptionCount(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Unexpected.token";
    Object v35 = "Option.mis";
    ((org.apache.commons.cli2.WriteableCommandLine)v33).addProperty(((java.lang.String)v34),((java.lang.String)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = " (";
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "true";
    Object v8 = "Unexpected.token";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getProperty(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)("Unexpected.token"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "--";
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "--";
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v7),((java.lang.Boolean)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Miss8ing.option";
    Object v35 = "\"";
    Object v36 = 0;
    Object v37 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v34),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()));
    ((org.apache.commons.cli2.WriteableCommandLine)v33).addOption(((org.apache.commons.cli2.Option)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "-";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.CommandLine)v6).getOptionCount(((org.apache.commons.cli2.Option)v10));
    Object v12 = "Miss8ing.option";
    Object v13 = "\"";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.CommandLine)v6).getOptionCount(((org.apache.commons.cli2.Option)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "org.apache.commons.cli2.resource.bundle";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).hasOption(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "ArgumentBuilder.null.validator";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Argument.unexpected.value";
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Usage:\n";
    Object v35 = "Command.preferredName.too.short";
    ((org.apache.commons.cli2.WriteableCommandLine)v33).addProperty(((java.lang.String)v34),((java.lang.String)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "ArgumentBuil`er.null.validator";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Miss8ing.option";
    Object v12 = "\"";
    Object v13 = 0;
    Object v14 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = 32;
    Object v16 = new java.util.Properties((((java.lang.Integer)v15).intValue()));
    Object v17 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v14),((java.util.Properties)v16));
    Object v18 = "Switch.enabled.startsWith.disabled";
    Object v19 = "ClassValidator.class.notfound";
    Object v20 = ((org.apache.commons.cli2.CommandLine)v17).getProperty(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.apache.commons.cli2.CommandLine)v17).getOptions();
    Object v22 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((org.apache.commons.cli2.Option)v10),((java.util.List)v21));
    Object v23 = "Switch.already.set";
    Object v24 = ((org.apache.commons.cli2.CommandLine)v6).getOptionCount(((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)(0), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Argumen";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Miss8ing.option";
    Object v12 = "\"";
    Object v13 = 0;
    Object v14 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = 32;
    Object v16 = new java.util.Properties((((java.lang.Integer)v15).intValue()));
    Object v17 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v14),((java.util.Properties)v16));
    Object v18 = "true";
    Object v19 = "Unexpected.token";
    Object v20 = ((org.apache.commons.cli2.CommandLine)v17).getProperty(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new java.lang.StringBuffer(((java.lang.CharSequence)v20));
    Object v22 = "Miss8ing.option";
    Object v23 = "\"";
    Object v24 = 0;
    Object v25 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = 32;
    Object v27 = new java.util.Properties((((java.lang.Integer)v26).intValue()));
    Object v28 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v25),((java.util.Properties)v27));
    Object v29 = "Miss8ing.option";
    Object v30 = "\"";
    Object v31 = 0;
    Object v32 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((org.apache.commons.cli2.CommandLine)v28).hasOption(((org.apache.commons.cli2.Option)v32));
    Object v34 = ((org.apache.commons.cli2.CommandLine)v28).getOptionTriggers();
    Object v35 = org.apache.commons.cli2.util.Comparators.preferredNameFirst();
    ((org.apache.commons.cli2.Option)v10).appendUsage(((java.lang.StringBuffer)v21),((java.util.Set)v34),((java.util.Comparator)v35));
    Object v36 = null;
    Object v37 = false;
    Object v38 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((org.apache.commons.cli2.Option)v10),((java.lang.Boolean)v37));
    org.junit.Assert.assertEquals((Object)(false), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "HelpFormratter.width.too.narrow";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Unexpected.token";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "false";
    Object v35 = "Option.missing.requkred";
    ((org.apache.commons.cli2.WriteableCommandLine)v33).addProperty(((java.lang.String)v34),((java.lang.String)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Miss8ing.option";
    Object v35 = "\"";
    Object v36 = 0;
    Object v37 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v34),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()));
    Object v38 = ((org.apache.commons.cli2.CommandLine)v33).getSwitch(((org.apache.commons.cli2.Option)v37));
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Option.i";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Switch.already.set";
    Object v8 = " g";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getProperty(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(" g"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "-";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((org.apache.commons.cli2.Option)v10),((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "--";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getOptionCount(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Unecpected.token";
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v7),((java.lang.Boolean)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Unexpected.token";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Unexpecte";
    Object v8 = "Miss8ing.option";
    Object v9 = "\"";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "--";
    Object v8 = "Miss8ing.option";
    Object v9 = "\"";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 32;
    Object v13 = new java.util.Properties((((java.lang.Integer)v12).intValue()));
    Object v14 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v11),((java.util.Properties)v13));
    Object v15 = ((org.apache.commons.cli2.CommandLine)v14).getProperties();
    Object v16 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Unexpected.token";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getProperty(((java.lang.String)v7));
    Object v9 = "Miss8ing.option";
    Object v10 = "\"";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((org.apache.commons.cli2.Option)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Miss8ing.option";
    Object v12 = "\"";
    Object v13 = 0;
    Object v14 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = 32;
    Object v16 = new java.util.Properties((((java.lang.Integer)v15).intValue()));
    Object v17 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v14),((java.util.Properties)v16));
    Object v18 = "Switch.enabled.startsWith.disabled";
    Object v19 = "ClassValidator.class.notfound";
    Object v20 = ((org.apache.commons.cli2.CommandLine)v17).getProperty(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.apache.commons.cli2.CommandLine)v17).getOptions();
    Object v22 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((org.apache.commons.cli2.Option)v10),((java.util.List)v21));
    Object v23 = "Miss8ing.option";
    Object v24 = "\"";
    Object v25 = 0;
    Object v26 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.apache.commons.cli2.Option)v26).isRequired();
    Object v28 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((org.apache.commons.cli2.Option)v26));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "ArgumentBuilder].empty.consume.remaining";
    Object v35 = ((org.apache.commons.cli2.CommandLine)v33).getProperty(((java.lang.String)v34));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "0 ";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "Unexpected.token";
    Object v35 = ((org.apache.commons.cli2.WriteableCommandLine)v33).looksLikeOption(((java.lang.String)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).hasOption(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = ", ";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "-M-";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getOption(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "--";
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v7),((java.lang.Boolean)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Option.missing.required0";
    Object v8 = "Unexpected.token";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getProperty(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "Un";
    Object v11 = "DateValidator.date.OutOfRa\\nge";
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getProperty(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)("DateValidator.date.OutOfRa\\nge"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "ArgumentBuilder.null.defaults";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).getOptionCount(((java.lang.String)v7));
    Object v9 = "Option.trigger.needs.prefix";
    Object v10 = "Miss8ing.option";
    Object v11 = "\"";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 32;
    Object v15 = new java.util.Properties((((java.lang.Integer)v14).intValue()));
    Object v16 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v13),((java.util.Properties)v15));
    Object v17 = "Miss8ing.option";
    Object v18 = "\"";
    Object v19 = 0;
    Object v20 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = false;
    Object v22 = ((org.apache.commons.cli2.CommandLine)v16).getSwitch(((org.apache.commons.cli2.Option)v20),((java.lang.Boolean)v21));
    Object v23 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((java.lang.String)v9),((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v5 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v6 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v7 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v8 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0)};
    Object v14 = new java.io.ByteArrayInputStream(((byte[])v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = new byte[]{Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.cli2.validation.FileValidator.getExistingDirectoryInstance();
    Object v21 = new byte[]{Byte.valueOf((byte)0)};
    Object v22 = new java.io.ByteArrayInputStream(((byte[])v21));
    Object v23 = new byte[]{Byte.valueOf((byte)0)};
    Object v24 = new java.io.ByteArrayInputStream(((byte[])v23));
    Object v25 = new byte[]{Byte.valueOf((byte)0)};
    Object v26 = new java.io.ByteArrayInputStream(((byte[])v25));
    Object v27 = new byte[]{Byte.valueOf((byte)0)};
    Object v28 = new java.io.ByteArrayInputStream(((byte[])v27));
    Object v29 = new byte[]{Byte.valueOf((byte)0)};
    Object v30 = new java.io.ByteArrayInputStream(((byte[])v29));
    Object v31 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v32));
    Object v34 = "[|";
    Object v35 = ((org.apache.commons.cli2.WriteableCommandLine)v33).looksLikeOption(((java.lang.String)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "--";
    Object v8 = "Miss8ing.option";
    Object v9 = "\"";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 32;
    Object v13 = new java.util.Properties((((java.lang.Integer)v12).intValue()));
    Object v14 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v11),((java.util.Properties)v13));
    Object v15 = "Switch.enabled.startsWith.disabled";
    Object v16 = "ClassValidator.class.notfound";
    Object v17 = ((org.apache.commons.cli2.CommandLine)v14).getProperty(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.cli2.CommandLine)v14).getOptions();
    Object v19 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((java.lang.String)v7),((java.util.List)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = ((org.apache.commons.cli2.CommandLine)v6).getOptions();
    Object v8 = "Miss8ing.option";
    Object v9 = "\"";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = "Miss8ing.option";
    Object v13 = "\"";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 32;
    Object v17 = new java.util.Properties((((java.lang.Integer)v16).intValue()));
    Object v18 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v15),((java.util.Properties)v17));
    Object v19 = "Miss8ing.option";
    Object v20 = "\"";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = "Miss8ing.option";
    Object v24 = "\"";
    Object v25 = 0;
    Object v26 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = 32;
    Object v28 = new java.util.Properties((((java.lang.Integer)v27).intValue()));
    Object v29 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v26),((java.util.Properties)v28));
    Object v30 = "Miss8ing.option";
    Object v31 = "\"";
    Object v32 = 0;
    Object v33 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((org.apache.commons.cli2.Option)v33).isRequired();
    Object v35 = ((org.apache.commons.cli2.CommandLine)v29).getValues(((org.apache.commons.cli2.Option)v33));
    Object v36 = ((org.apache.commons.cli2.CommandLine)v18).getValues(((org.apache.commons.cli2.Option)v22),((java.util.List)v35));
    Object v37 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = ((org.apache.commons.cli2.CommandLine)v6).getOptions();
    Object v8 = "Passes properties and values to the application";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).hasOption(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Miss8ing.option";
    Object v12 = "\"";
    Object v13 = 0;
    Object v14 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = 32;
    Object v16 = new java.util.Properties((((java.lang.Integer)v15).intValue()));
    Object v17 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v14),((java.util.Properties)v16));
    Object v18 = "Option.missing.required0";
    Object v19 = "Unexpected.token";
    Object v20 = ((org.apache.commons.cli2.CommandLine)v17).getProperty(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "Un";
    Object v22 = "DateValidator.date.OutOfRa\\nge";
    Object v23 = ((org.apache.commons.cli2.CommandLine)v17).getProperty(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((org.apache.commons.cli2.Option)v10),((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)("DateValidator.date.OutOfRa\\nge"), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "true";
    Object v8 = ((org.apache.commons.cli2.CommandLine)v6).hasOption(((java.lang.String)v7));
    Object v9 = "Miss8ing.option";
    Object v10 = "\"";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Option.missing.required";
    Object v14 = ((org.apache.commons.cli2.Option)v12).findOption(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.cli2.CommandLine)v6).getValue(((org.apache.commons.cli2.Option)v12));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = ((org.apache.commons.cli2.CommandLine)v6).getOptions();
    Object v8 = "Miss8ing.option";
    Object v9 = "\"";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "Miss8ing.option";
    Object v8 = "\"";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.CommandLine)v6).getValues(((org.apache.commons.cli2.Option)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "Miss8ing.option";
    Object v1 = "\"";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.cli2.commandline.PropertiesCommandLine(((org.apache.commons.cli2.Option)v3),((java.util.Properties)v5));
    Object v7 = "DateValiZdator.date.OutOfRange";
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli2.CommandLine)v6).getSwitch(((java.lang.String)v7),((java.lang.Boolean)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
