public boolean xyBalance(String str) {
    boolean bool = false;
    for(int i = str.length() - 1; i >= 0; i--) {
        if(str.charAt(i) == 'y') bool = true;
        if(str.charAt(i) == 'x' && !bool) return false;
    }

    return true;
}