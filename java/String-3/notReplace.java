public String notReplace(String str) {

    String t = "";
    str = " " + str + " ";//para cuando me paso de la str xd

    for (int i = 0; i < str.length()-1; i++) {

        if (str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i+2)) && !Character.isLetter(str.charAt(i-1))){
            t += str.substring(i,i+2) + " not";
            i++;

        }

        else {
            t += str.charAt(i);
        }
    }

    return t.trim();//devuelve la str sin espacios al principio ni al final
}