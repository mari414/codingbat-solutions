public String oneTwo(String str) {
  
  String string = "";
  for(int i = 0; i < str.length() - 2; i+=3) {
    string += str.substring(i+1, i+3) + str.charAt(i);
  }
  return string;
}
