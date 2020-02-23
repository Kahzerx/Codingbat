public int sum13(int[] nums) {
    int resultado = 0;

    for (int i = 0; i < nums.length ; i++) {
        if (nums[i] == 13) i++;
        else resultado += nums[i];
    }
    return resultado;
}