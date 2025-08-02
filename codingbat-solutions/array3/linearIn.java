public boolean linearIn(int[] outer, int[] inner) {
  
  int count = 0;
  int j = 0;
  if(inner.length == 0)
    return true;
  for(int i = 0; i < outer.length; i++) {
    if(outer[i] == inner[j]) {
      count++;
      j++;
    } else if(outer[i] > inner[j])
      return false;
    if(count == inner.length)
      return true;
  }
  return false;
}
