public int maxBlock(String str) {
    
    if (str.length()  < 1) return 0;

    int masAlto = 1;
    int contador = 1;
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i + 1) == str.charAt(i)) {
            contador++;

            if (masAlto < contador){
                masAlto = contador;
            }

        } else {
            contador = 1;

        }
    }
    return masAlto;
}