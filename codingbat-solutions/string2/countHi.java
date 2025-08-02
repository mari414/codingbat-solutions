public int countHi(String str) {
  
  int count = 0;
  int length = str.length();
  for (int i = 0; i < length-1; i++) {
      if ((str.charAt(i) == 'h') && (str.charAt(i+1) == 'i')) {
        count++;
      } 
  }
  return count;

}