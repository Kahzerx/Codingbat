public boolean prefixAgain(String str, int n) {
    String pre = str.substring(0, n);
    
    for(int i = n; i <= str.length() - n; i++) {
        if(str.substring(i, i + n).equals(pre)) return true;
    }
    
    return false;
}