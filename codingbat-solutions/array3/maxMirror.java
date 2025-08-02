public int maxMirror(int[] nums) {
  
  int max = 0;
  for (int i = 0; i < nums.length; i++) { //i will serve as the start of the array
    int cnt = 0; //will count lengths of mirrored elements
    for (int j = nums.length - 1; j >= 0; j--) { //j will serve as the 'end' of the array
      // if (cnt + i < nums.length) //
        if (cnt + i < nums.length && nums[i + cnt] == nums[j]) { 
          cnt++;
          if (max > cnt); //checks for larger group of contiguous elements
          else
            max = cnt;
        } else if (cnt > 0) {
          cnt = 0;
        }
    }
  }
  return max;
}
