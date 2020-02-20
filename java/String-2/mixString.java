public String mixString(String a, String b) {

    String resultado = "";

    if (a.length() > b.length()) {
        for (int i = 0; i < b.length(); i++) {
            resultado += a.charAt(i) + b.charAt(i);
        }
        return resultado += a.substring(b.length());
    }

    for (int i = 0; i < a.length(); i++){
        resultado += a.charAt(i) + b.charAt(i);
    }

    return resultado += b.substring(a.length());
}