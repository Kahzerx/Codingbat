public boolean isEverywhere(int[] nums, int val) {
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] != val && nums[i + 1] != val) return false;
        //tiene que alternarse val y numero random, si en 2 numeros seguidos no esta val se devuelve false
    }
    return true;
}