public static int sumDigits(String str){
    int contador = 0;

    for (int i = 0; i < str.length();i++){//isDigit detecta si lo que analizamos es un numero o no
        if (Character.isDigit(str.charAt(i))) contador += Integer.parseInt(str.substring(i,i+1));
    }

    return contador;
}