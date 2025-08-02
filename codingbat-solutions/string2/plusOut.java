public String plusOut(String str, String word) {
  
  String string = "";
  int length = word.length();
  
  for(int i = 0; i < str.length(); i++) {
    if(i + length > str.length())
      break;
    else if(str.substring(i, i + length).equals(word)) {
      string += word;
      i += length - 1;
    }
    else {
      string += "+";
    }
  }
  if(string.length() != str.length()) {
    while(string.length() != str.length()) {
      string += "+";
    }
  }
  return string;
}