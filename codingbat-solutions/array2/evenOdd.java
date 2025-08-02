public int[] evenOdd(int[] nums) {
  
  int [] a = new int[nums.length];
  int count = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 == 0) {
      a[count] = nums[i];
      count++;
    }
  }
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 != 0) {
      a[count] = nums[i];
      count++;
    }
  }
  return a;
}
