public int commonTwo(String[] a, String[] b) {
  
  int count = 0;
  String prev = "";
  for(int i = 0; i < a.length; i++) {
    if(!a[i].equals(prev))
    for(int j = 0; j < b.length; j++) {
      if(a[i] == b[j]) {
        count++;
        prev = a[i];
        break;
      }
    }
  }
  return count;
}
