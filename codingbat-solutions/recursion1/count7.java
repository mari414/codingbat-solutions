public int count7(int n) {
  

  int num = 0;
  if (n < 10) {
    if (n==7) {
      return 1; 
    }
  } else {
    if (n %  10==7) {
      return 1 + count7(n / 10);
    } else {
      return 0 + count7(n/10);
    }
  }
  return 0;
}
