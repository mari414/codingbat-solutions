public int countClumps(int[] nums) {
  
  int count = 0; int value = -1;
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == nums[i + 1] && value != nums[i]) {
      value = nums[i];
      count++;
    } 
    else if (value != nums[i + 1])
      value = -1;
    else;
  }
  return count;
}
