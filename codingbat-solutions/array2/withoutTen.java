public int[] withoutTen(int[] nums) {
  
  int [] a = new int[nums.length];
  int count = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] != 10) {
      a[count] = nums[i];
      count++;
    }
  }
  for(int i = count; i < nums.length; i++) {
    a[i] = 0;
  }
  return a;
}
