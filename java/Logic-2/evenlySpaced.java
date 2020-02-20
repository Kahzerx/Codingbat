public boolean evenlySpaced(int a, int b, int c) {
  int aux;
  if(a > b) {
    aux = a;
    a = b;
    b = aux;
  }
  if(b > c) {
    aux = b;
    b = c;
    c = aux;
  }
  if(a > b) {
    aux = a;
    a = b;
    b = aux;
  }
  return b - a == c - b;
}
