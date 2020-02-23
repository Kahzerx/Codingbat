public boolean sameEnds(int[] nums, int len) {
    int contador = 0;
    while (contador < len) {
        if (nums[contador] != nums[nums.length - len + contador]) {
            return false;
        }
        contador++;
    }
    return true;
}