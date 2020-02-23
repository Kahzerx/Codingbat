public boolean only14(int[] nums) {
    int contador = 0;

    for (int i : nums) {
        if (i == 1 || i == 4) contador++;
    }
    return contador == nums.length;
}