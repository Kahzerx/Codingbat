public String stringSplosion(String str) {
  int size = (str.length() * (str.length() + 1)) / 2;
  char[] resultado = new char[size];
    
  int index = 0;
  for(int i = 0; i < str.length(); i++) {
    for(int j = 0; j <= i; j++) {
      resultado[index] = str.charAt(j);
      index++;
    }
  }
  return new String(resultado);
}
