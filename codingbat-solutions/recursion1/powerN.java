public int powerN(int base, int n) {
  
  if (n == 0) {
    return 1;
  } else if (n == 1) {
    return base;
  } else {
    return base * powerN(base, n-1);
  }
}
