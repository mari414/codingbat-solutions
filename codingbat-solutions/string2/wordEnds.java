
public String wordEnds(String str, String word) {
  String string = "";
  int wLength = word.length();
  int sLength = str.length();

  for(int i = 0; i < sLength; i++) {
    if(sLength == wLength)
      return "";
    else if(i + wLength == sLength && str.substring(i, i + wLength).equals(word)) {
      string += str.charAt(sLength - wLength - 1);
      return string;
    }
    else if(i + wLength < sLength && str.substring(i, i + wLength).equals(word)) {
      if(i == 0)
      ;
      else {
        string += str.charAt(i - 1);
      }
      string += str.charAt(i + wLength);
    }
  }
  return string;
}