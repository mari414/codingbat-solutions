public int[] zeroMax(int[] nums) {
  
  int maxOdd = -1;
  for (int i = nums.length - 1; i >= 0; i--) {
    if (nums[i] != 0) {
      if ((nums[i] >= maxOdd) && (nums[i] % 2 == 1)){
        maxOdd = nums[i];
      }
    } else {
      if (maxOdd != -1) {
        nums[i] = maxOdd;
      }
    }
  }
  return nums;
}
