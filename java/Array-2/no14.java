public boolean no14(int[] nums) {
    int contador1 = 0;
    int contador4 = 0;

    for (int resultado : nums)
        if (resultado == 4) contador4++;
        else if (resultado == 1) contador1++;
    return !(contador1 > 0 && contador4 > 0);
}