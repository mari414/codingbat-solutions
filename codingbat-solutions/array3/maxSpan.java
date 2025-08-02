public int maxSpan(int[] nums) {
  
  int length = 0; int num;
  int i = 0;
  while (i < nums.length) {
    int j = 0;
    while (j < nums.length) {
      if (nums[i] == nums[j]) {
        num = j - i + 1;
        length = Math.max(num, length);
      }
      j++;
    }
    i++;
  }
  return length;
}
