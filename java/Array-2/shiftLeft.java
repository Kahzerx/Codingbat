public int[] shiftLeft(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
        int aux = nums[i];
        nums[i] = nums[i + 1];
        nums[i + 1] = aux;
    }
    return nums;
}