public boolean prefixAgain(String str, int n) {
  
  String string = str.substring(0, n);
  
  for(int i = n; i <= str.length() - string.length(); i++) {
    if(str.substring(i, i + string.length()).equals(string)) {
      return true;
    }
  }
  return false;
}
