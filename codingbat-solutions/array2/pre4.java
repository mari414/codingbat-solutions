public int[] pre4(int[] nums) {
  
  int count = 0;
  for(int i: nums) {
    if(i == 4) break;
    count++;
  }
  int [] array = new int [count];
  for(int i = 0; i < count; i++) {
    array[i] = nums[i];
  }
  return array;
}