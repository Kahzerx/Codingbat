public String mirrorEnds(String str) {

    String t = "";

    for (int i = 0; i < str.length(); i++) {

        if (str.charAt(i) == str.charAt(str.length()-i-1)) t += str.charAt(i);
        
        else break;

    }
    return t;
}