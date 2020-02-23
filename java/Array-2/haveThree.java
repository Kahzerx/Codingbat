public boolean haveThree(int[] nums) {
    int contador = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            contador++;
            i++;
        }
    }
    return contador == 3;
}