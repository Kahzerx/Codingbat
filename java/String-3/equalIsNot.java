public boolean equalIsNot(String str) {

    int contadorIs = 0;
    int contadorNot = 0;

    for (int i = 0; i < str.length(); i++){
        
        if (str.length() >= i+2 && str.substring(i,i+2).contains("is")) contadorIs++;

        if (str.length() >= i + 3 && str.substring(i,i+3).contains("not")) contadorNot++;
    }

    return contadorIs == contadorNot;
}