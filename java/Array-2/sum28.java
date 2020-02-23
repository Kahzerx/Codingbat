public boolean sum28(int[] nums) {
    int contador = 0;

    for (int i : nums) {
        if (i == 2) contador++;
    }
    return contador == 4;
}