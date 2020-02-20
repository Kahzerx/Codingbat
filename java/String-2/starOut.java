public String starOut(String str) {

    char[] arr = new char[str.length()];
    int contador = 0;

    if(str.length() < 1) return "";

    if(str.length() == 1) {
        return str.charAt(0) == '*' ? "" : str;
    }

    if(str.charAt(0) != '*' && str.charAt(1) != '*') {
        arr[contador] = str.charAt(0);
        contador++;
    }

    for(int i = 1; i < str.length() - 1; i++) {
        if(str.charAt(i-1)!='*' && str.charAt(i) != '*' && str.charAt(i+1) != '*') {
            arr[contador] = str.charAt(i);
            contador++;
        }
    }

    if(str.charAt(str.length()-1) != '*' && str.charAt(str.length()-2) != '*') {
        arr[contador] = str.charAt(str.length() - 1);
        contador++;
    }

    return new String(arr, 0, contador);
}