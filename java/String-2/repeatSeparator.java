public String repeatSeparator(String word, String sep, int count) {
	
    String resultado = "";

    if (count == 0) {
        return resultado;
    }

    for (int i = 0; i < count - 1; i++) {
        resultado += word + sep;
    }

    return resultado += word;

}