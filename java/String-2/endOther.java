public boolean endOther(String a, String b) {
    if(a.length() < b.length()) {
        String aux = a;
        a = b.toUpperCase();
        b = aux.toUpperCase();
    }

    return a.substring(a.length() - b.length()).equals(b);
}