public int[] swapEnds(int[] nums) {
  int aux = nums[0];
  nums[0] = nums[nums.length - 1];
  nums[nums.length - 1] = aux;
  return nums;
}
