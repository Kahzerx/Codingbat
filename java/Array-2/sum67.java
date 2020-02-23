public int sum67(int[] nums) {
	boolean add = true;
	int sum = 0;
	for (int i : nums){
		if(i == 6) add = false;
		else if(i == 7 && add == false) add = true;
		else if(add) sum += i;
	}
	return sum;
}
