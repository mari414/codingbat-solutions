public String repeatEnd(String str, int n) {
  
  String added = "";
  for(int i = 0; i < n; i++) {
    added += str.substring(str.length() - n);
  }
  return added;
}
