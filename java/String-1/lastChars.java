public String lastChars(String a, String b) {
  String primera = "@";
  String ultima = "@";;

  if(a.length() > 0) primera = a.substring(0,1);

  if(b.length() > 0) ultima = b.substring(b.length() - 1);

  return primera + ultima;
}
