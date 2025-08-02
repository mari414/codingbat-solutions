public String repeatSeparator(String word, String sep, int count) {
  
  String temp = "";
  
  if(count == 0) {
    return temp;
  }
  
  for(int i = 0; i < count - 1; i++) {
    temp += word + sep;
  }
  temp += word;
  return temp;
}
