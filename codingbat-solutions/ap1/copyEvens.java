public int[] copyEvens(int[] nums, int count) {
  
  int [] a = new int[count];
  int cnt = 0;
  int i = 0;
  
  while(cnt < count) {
    if(nums[i] % 2 == 0) {
      a[cnt] = nums[i];
      cnt++;
    }
    i++;
  }
  return a;
}
