public int[] tenRun(int[] nums) {
    int principio = 0;

    while (principio < nums.length && !(nums[principio] % 10 == 0)) principio++;

    for (int i = principio; i < nums.length - 1; i++) {
        if (nums[i + 1] % 10 != 0) nums[i + 1] = nums[i];//coloca el valor actual en el siguiente a no ser que sea multiplo
    }
    return nums;
}