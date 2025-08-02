public boolean dividesSelf(int n) {
  
  int value = n;
    while (n > 0)
      if (n % 10 == 0) 
        return false;
      else
        if (value % (n % 10) == 0) 
          n /= 10;
      else 
        return false;
  return true;
}
