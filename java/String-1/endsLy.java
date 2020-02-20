public boolean endsLy(String str) {
  return str.length() < 2 ? false : str.substring(str.length() - 2).equals("ly");
}
