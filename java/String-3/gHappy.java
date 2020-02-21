public boolean gHappy(String str) {

    boolean feliz = true;
    str = str + " ";//para cuando me paso xd

    for (int i = 0; i < str.length(); i++) {

        if (i == 0 && str.charAt(i) == 'g' && str.length() - i > 0 && str.charAt(i + 1) != 'g') feliz = false;

        if (i > 0 && str.length() - i > 0 && str.charAt(i) == 'g' && (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g')) feliz = false;

        if (i > 0 && str.length() - 1 > 0 && str.charAt(i) == 'g' && (str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g')) feliz = true;

    }

    return feliz;

}