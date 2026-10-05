package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "";
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).rtrim(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    ((org.apache.commons.cli.HelpFormatter)v0).setArgName(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }
}
