public int[] fix45(int[] nums) {
  
  int value = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      for(int j = 0; j < nums.length; j++) {
        if(nums[j] == 5) {
          if (j >= 1 && nums[j - 1] != 4) {
            value = nums[i + 1];
            nums[i + 1] = 5;
            nums[j] = value;
          } 
          if (j < 1) {
            value = nums[i + 1];
            nums[i + 1] = 5;
            nums[j] = value;
          }
        }
      }
    }
  }
  return nums;
}
