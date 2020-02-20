public String withoutX(String str) {
  int principio = 0;
  int fin = str.length();
    
  if(str.length() > 0 && str.charAt(0) == 'x') principio = 1;

  if(str.length() > 1 && str.charAt(str.length() - 1) == 'x') fin--;

  return str.substring(principio, fin);
}
