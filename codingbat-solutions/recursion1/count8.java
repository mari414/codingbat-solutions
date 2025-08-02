public int count8(int n) {
  
  int num = 0;
  if (n < 10) {
    if (n == 8) {
      return 1; 
    }
  } else {
    if (n %  100 == 88) {
      return 2 + count8(n / 10);
    } else if(n % 10 == 8) {
      return 1 + count8(n / 10);
    } else {
      return 0 + count8(n/10);
    }
  }
  return 0;
}
