public String stringTimes(String str, int n) {
  char[] copy = new char[n * str.length()];
  int index = 0;
  
  for(int i = 0; i < n; i++) {
    for(int j = 0; j < str.length(); j++) {
      copy[index] = str.charAt(j);
      index += 1;
    }
  }
  return new String(copy);
}
