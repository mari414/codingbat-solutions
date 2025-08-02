public int maxBlock(String str) {
  
  int count = 0;
  int max = 0;
  for(int i = 0; i < str.length(); i++) {
    count = 0;
    for(int j = i; j < str.length(); j++) {
      if(str.charAt(i) == str.charAt(j))
        count++;
      else
        break;
    }
    if(count > max)
      max = count;
  }
  return max;
}
