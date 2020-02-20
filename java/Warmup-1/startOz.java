public String startOz(String str) {
  String resultado = "";
  
  if(str.length() >= 1 && str.charAt(0) == 'o') resultado += str.charAt(0);
  if(str.length() >= 2 && str.charAt(1) == 'z') resultado += str.charAt(1);
  return resultado;
}
