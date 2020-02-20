public int noTeenSum(int a, int b, int c) {
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
}

public int fixTeen(int n) {
  return 13 <= n && n <= 19 && n != 15 && n != 16 ? 0 : n;
}
