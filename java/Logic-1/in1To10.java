public boolean in1To10(int n, boolean outsideMode) {
  return outsideMode ? n <= 1 || 10 <= n : 1 <= n && n <= 10;
}
