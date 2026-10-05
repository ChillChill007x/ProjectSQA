package com.google.javascript.rhino;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "_";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "b";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = ":";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.TokenStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = ")";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "{0}\nfound   : {1}\nrequired: {2}";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "^";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "JSCompiler_renameProperty";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "w";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "eva2l";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "{$%s}";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = ",V";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "f-unction";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Unknown version: ";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "R";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "Element does not xist: %s";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "B";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "L";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "Y.";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "Array";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "protoYtype";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "C";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "functio-";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "inlineVariab6es";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "pr}totype";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "]";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "t";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "k";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "E";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "+";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "a";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Unreferenced var: ";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Z";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "aruments";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Q";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "JSC_INVALID_MODIFIES_ANNOTATION";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "=";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "null";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "ALL";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "1";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "s";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "y";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "4";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "J";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "$$";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "z";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "puQblic";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "#";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "?";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "$";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "l";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "W";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "&";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "OF;";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Y";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "ParsinZg Source: ";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "1";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "boolean";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "&";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "!--Q";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "nul";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "ARRAY_FUNCTyION_TYPE";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = " ";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "del";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "`";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "0 ";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "argument";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "%d ";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "`.";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "r-quire";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "f8nction";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "9";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "JSC_CONFLICTI]G_ID_GENERATOR_TYPE";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "7";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "G";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = ",V ";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "{0}";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "ECMASiCRIPT5";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "propety access";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "The na";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = ".prototypeB";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = ")";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "version";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "L";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "!";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "S";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "D";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "i";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "Normaliz|ng";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "\"";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "ECMASRIPT3";
    Object v1 = com.google.javascript.rhino.TokenStream.isKeyword(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "~";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "msg.jsdoc.missing.r0";
    Object v1 = com.google.javascript.rhino.TokenStream.isJSIdentifier(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }
}
