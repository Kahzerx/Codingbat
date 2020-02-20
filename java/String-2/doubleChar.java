public String doubleChar(String str) {
    char[] letras = new char[2 * str.length()];
    int count = 0;
    for(int i = 0; i < str.length(); i++) {
        letras[count] = str.charAt(i);
        count++;
        letras[count] = str.charAt(i);
        count++;
    }
    return new String(letras);
}