public int countYZ2(String str) {
    int contador = 0;
    str = str.toUpperCase() + " ";
    for ( int i = 0; i < str.length() - 1; i++){
        if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && !Character.isLetter(str.charAt(i+1))) count++;
    }
    return count;
}