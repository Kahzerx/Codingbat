public String getSandwich(String str) {

    int primero = str.indexOf("bread");//indexOf es legal no? :P >.<
    int ultimo = str.lastIndexOf("bread");//arriba python \o/

    return primero == ultimo ? "" : str.substring(f + 5, l);
}