public int[] post4(int[] nums) {
  
  int last4 = 0;
  for (int i = nums.length - 1; i >= 0; i--) {
    if (nums[i] == 4) {
      last4 = i;
      break;
    }
  }
  int[] temp = new int[nums.length - 1 - last4];
  int ctr1 = 0;
  for (int i = last4 + 1; i < nums.length; i++){
    temp[ctr1] = nums[i];
    ctr1++;
  }
  return temp;
}
