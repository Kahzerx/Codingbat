public String oneTwo(String str) {
    String resultado = "";

    for (int i = 0; i < str.length()-2; i+=3) {
        resultado += str.substring(i+1, i+3) + str.substring(i,i+1);
    }

    return resultado;
}