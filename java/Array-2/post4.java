public int[] post4(int[] nums) {//este fue raro
    int[] list;
    int i = 0;
    int k = 0;

    while(!(nums[nums.length - 1 - i] == 4)) i++;//detecta la posicion del 4 si es que hay
    //empiezo a contar desde atras porque es el ultimo 4 ofc
    list = new int[i];

    for (int j = nums.length - 1; j > nums.length - 1 - i; j--) {//añade el resto de ints despues del 4
        list[i - 1 - k] = nums[j];
        k++;
    }
    return list;
}