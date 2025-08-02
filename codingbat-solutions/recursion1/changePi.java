public String changePi(String str) {
  
  int length = str.length();
  if(length == 0 || length == 1) {
    return str;
  } else {
    if(str.substring(0,2).equals("pi")) {
      return "3.14" + changePi(str.substring(2));
    } else {
      return "" + str.charAt(0) + changePi(str.substring(1));
    }
  }
}
