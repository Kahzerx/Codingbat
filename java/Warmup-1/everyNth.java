public String everyNth(String str, int n) {
  int size = (int) Math.ceil((double) str.length() / n); //devuelve el entero mayor o igual más próximo a un número dado.
  char[] charn = new char[size];
  int index = 0;

  for(int i = 0; i < str.length(); i += n) {
    charn[index] = str.charAt(i);
    index++;
    }

  return new String(charn);
}
