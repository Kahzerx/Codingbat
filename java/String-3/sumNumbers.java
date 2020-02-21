public int sumNumbers(String str) {
    int sum = 0;
    String strSum = "";
    str = str + " ";
    boolean digito = false;
    for (int i = 0; i < str.length(); i++) {
        char s = str.charAt(i);
        if (digito && Character.isDigit(str.charAt(i))) strSum += str.charAt(i);

        else if (Character.isDigit(str.charAt(i))) {
            strSum += str.charAt(i);
            digito = true;
        }
        else {

            if (strSum != "" && digito == true) {
                sum += Integer.parseInt(strSum);
                strSum = "";
            }
            
            digito = false;

        }
    }
    return sum;

}