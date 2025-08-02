public boolean sameStarChar(String str) {
  
  char[] array = str.toCharArray();

  for(int i = 1; i < array.length - 1; i++) {
    if(array[i] == '*' && array[i-1] != array[i+1])
      return false;
  }
  return true;
}