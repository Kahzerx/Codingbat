public String plusOut(String str, String word) {

    if (str.contains(word)) str = str.replace(word,  "--");

    for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) != '-') str = str.replace(str.substring(i,i+1), "+");
    }

    str = str.replace("--",word);

    return str;
}