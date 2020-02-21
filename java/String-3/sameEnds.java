public String sameEnds(String string) {
    
    String resultado = "";
    
    for (int i = 0; i <= string.length()/2; i++){
        if (string.substring(0, i).equals(string.substring(string.length()-i, string.length()))){
            resultado = string.substring(0, i);
        }
    }
    return resultado;
}