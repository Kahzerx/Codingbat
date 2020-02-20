public String wordEnds(String str, String word) {
    int strLeng = str.length();
    int wordLeng = word.length();

    String resultado = "";

    for (int i = 0; i < strLeng - wordLeng + 1; i++) {
        String aux = str.substring(i, i + wordLeng);

        if (i > 0 && aux.equals(word)) resultado += str.substring(i - 1, i);

        if (i < strLeng - wordLeng && aux.equals(word)) resultado += str.substring(i + wordLeng, i + wordLeng + 1);
    }
    return resultado;
}