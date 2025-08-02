public String notReplace(String str) {
  
  String result = "";
  str = " " + str + "  ";
  for (int i = 0; i < str.length() - 2; i++) {
    if (str.charAt(i) == 'i') {
      if (str.charAt(i + 1) == 's'
        && !Character.isLetter(str.charAt(i + 2))
        && !Character.isLetter(str.charAt(i - 1))) {
          result += "is not";
          i += 1;
      } else result += "i";
    } else result += str.charAt(i);
  }
  return result.substring(1);
}
