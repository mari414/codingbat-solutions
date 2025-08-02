public int scoresSpecial(int[] a, int[] b) {
  
  return findScore(a) + findScore(b);
}

public int findScore(int [] array) {
  int value = 0;
  for(int i: array) {
    if(i > value && i % 10 == 0)
      value = i;
  }
  return value;
}
