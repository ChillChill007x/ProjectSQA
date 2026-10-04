package sqa.fixtures;

// Matches package-private Defects4J targets such as Codec's SoundexUtils.
class PackageTarget {
  PackageTarget() { }
  static int twice(int x) { return x * 2; }
  int value() { return 7; }
  private static int hidden() { return 99; }
}
