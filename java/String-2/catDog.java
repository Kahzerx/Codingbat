public boolean catDog(String str) {
    int perro = 0;
    int gato = 0;

    for (int i = 0; i < str.length() - 2; i++) {
        if (str.substring(i, i + 3).contains("cat")) gato++;
        if (str.substring(i, i + 3).contains("dog")) perro++;
    }

    return gato == perro ? true : false;
}