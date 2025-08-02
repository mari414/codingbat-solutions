public String repeatFront(String str, int n) {
  
  String temp = "";
  for(int i = n; i > 0; i--) {
    temp += str.substring(0, i);
  }
  return temp;
}
