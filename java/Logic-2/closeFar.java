public boolean closeFar(int a, int b, int c) {
  return (close(a, b) && far(a, b, c)) || (close(a, c) && far(a, c, b));
}

public boolean close(int a, int b) {
  return Math.abs(a - b) <= 1;
}

public boolean far(int a, int b, int c) {
  return Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;
}