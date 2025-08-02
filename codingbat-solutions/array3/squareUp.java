public int[] squareUp(int n) {
  
  int[] array = new int[(int) Math.pow(n, 2)];
  int num = 0;
  for (int i = 1; i <= n; i++) {
    for (int k = 1; k <= n - i; k++) 
      array[num++] = 0;
    for (int j = i; j > 0; j--) 
      array[num++] = j;
  }
  return array;
}
