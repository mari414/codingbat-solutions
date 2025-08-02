public String starOut(String str) {
  
  int length = str.length();
  String string = "";
  for (int i = 0; i < length; i++) {
    if (i == 0 && str.charAt(i) != '*')
      string += str.charAt(i);
    if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
      string += str.charAt(i);
    if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
      string = string.substring(0, string.length()-1);
  }
  return string;
}
