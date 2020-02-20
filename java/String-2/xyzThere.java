public boolean xyzThere(String str) {
    if (str.length() < 3) return false;

    if (str.substring(0,1).equals(".")){
        return xyzThere(str.substring(2));
    }

    return str.substring(0,3).equals("xyz") ? true : xyzThere(str.substring(1));
}