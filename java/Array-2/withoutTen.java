public int[] withoutTen(int[] nums) {
    int[] resultado = new int[nums.length];//len de la array
    int j = 0;//contador

    for (int num : nums) {
        if (num != 10) {
            resultado[j] = num;//añado los nºs distintos de 10
            j++;//si no le das valores a array con len ya declarada se adjudican 0
        }
    }
    return resultado;
}