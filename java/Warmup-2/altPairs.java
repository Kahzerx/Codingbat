public String altPairs(String str) {
  char[] result = new char[str.length()];
  int count = 0;
    
  int i = 0;
  int i2 = 1;
  while(i < str.length()) {
      result[count] = str.charAt(i);
      count++;
      i += i2;
      i2 = i2 == 1 ? 3 : 1;
  }
  return new String(result, 0, count);
}
