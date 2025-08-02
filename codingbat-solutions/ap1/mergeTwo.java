public String[] mergeTwo(String[] a, String[] b, int n) {
  
  String [] array = new String[n];
  int aCount = 0, bCount = 0;

  for(int i = 0; i < n; i++) {
    if(a[aCount].compareTo(b[bCount]) == 0) {
      array[i] = a[aCount];
      aCount++;
      bCount++;
    } else if(a[aCount].compareTo(b[bCount]) < 0) {
      array[i] = a[aCount];
      aCount++;
    } else {
      array[i] = b[bCount];
      bCount++;
    }
  }
  return array;
}
