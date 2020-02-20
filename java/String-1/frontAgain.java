public boolean frontAgain(String str) {
  return str.length() < 2 ? false : str.substring(0, 2).equals(str.substring(str.length() - 2));
}
