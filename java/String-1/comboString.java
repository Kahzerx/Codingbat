public String comboString(String a, String b) {
  if(b.length() < a.length()) {
    String aux = a;
    a = b;
    b = aux;
  }
  return a + b + a;
}
