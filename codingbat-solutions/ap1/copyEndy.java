public int[] copyEndy(int[] nums, int count) {
  
  int [] array = new int[count];
  int ctr = 0;
  
  for(int i: nums) {
    if(ctr < count && isEndy(i)) {
      array[ctr] = i;
      ctr++;
    }
  }
  return array;
}
public boolean isEndy(int n) {
  if((n >= 0 && n <= 10) || (n >= 90 && n <= 100))
    return true;
  return false;
}
