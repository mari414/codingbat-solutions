public String mirrorEnds(String string) {
  
  String result = "";
  for (int i = 0, j = string.length() - 1; i < string.length(); i++, j--) {
    if (string.charAt(i) == string.charAt(j))
      result += string.charAt(i);
    else break;
  }
    return result;
}
