package sqa.fixtures;
public class BranchBox {
  private int value;
  public BranchBox() { value = 0; }
  public BranchBox(int initial) { value = initial; }
  public void set(int n) { value = n; }
  public int get() { return value; }
  public static int branch(int x) { return x == 42 ? 7 : x < 0 ? -1 : 1; }
  public static Object factory() { return new BranchBox(42); }
  public static int consume(BranchBox b) { return b.get() == 42 ? 99 : 0; }
  public static String text(String s) { return "magic".equals(s) ? "yes" : "no"; }
  public static int external(Helper helper) { return helper.value() == 42 ? 8 : 3; }
}
