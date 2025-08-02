public String sameEnds(String string) {
  
  int count;
  int length = string.length();
  String str = "";
   
  for(count = length / 2; count > 0; count--){
    if(string.substring(0,count).equals(string.substring(length - count, length))) {
      str += string.substring(0, count);
      break;
    }
  }
  return str;
}
