public boolean evenlySpaced(int a, int b, int c) {
  
  if(a == b && b == c)
    return true;
  if(a == b || b == c || a == c)
    return false;
  if(Math.abs(a - b) == Math.abs(b - c))
    return true;
  if(Math.abs(a - b) == Math.abs(a - c))
    return true;
  if(Math.abs(a - c) == Math.abs(b - c))
    return true;
  return false;
}
