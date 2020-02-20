public String minCat(String a, String b) {
  return a.substring(a.length() - Math.min(a.length(), b.length())) + b.substring(b.length() - Math.min(a.length(), b.length()));
}
