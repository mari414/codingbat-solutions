public int[] seriesUp(int n) {
  
  int count = 0;
  int [] array = new int[n * (n + 1) / 2];
  for(int i = 0; i <= n; i++) {
    int temp = 1;
    while(temp < i + 1) {
      array[count] = temp;
      count++;
      temp++;
    }
  }
  return array;
}
