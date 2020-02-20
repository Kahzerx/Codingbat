public boolean xyzMiddle(String str) {
    int inicio0 = str.length() / 2 - 2;
    int inicio1 = str.length() / 2 - 1;

    if(str.length() < 3) return false;

    return str.length() % 2 == 0 ? str.substring(inicio0, inicio0 + 3).equals("xyz") || str.substring(inicio1, inicio1 + 3).equals("xyz") : str.substring(inicio1, inicio1 + 3).equals("xyz");
}