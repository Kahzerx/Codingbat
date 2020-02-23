public int bigDiff(int[] nums) {
    int max = nums[0];
    int min = nums[0];

    for (int n : nums) {
        if (n > max) max = n;
        else if (n < min) min = n;
    }
    return max - min;
}