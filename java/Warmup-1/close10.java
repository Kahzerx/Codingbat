public int close10(int a, int b) {
  int A = Math.abs(a - 10);
  int B = Math.abs(b - 10);

  if(A == B) return 0;

  return A < B ? a : b;
}
