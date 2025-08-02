public String noX(String str) {
  
  int length = str.length();
  if(length == 0) {
    return str;
  } else if(length == 1) {
    if(str.equals("x")) {
      return "";
    } else {
      return str;
    }
  } else {
    if(str.substring(0, 1).equals("x")) {
      return "" + noX(str.substring(1));
    } else {
      return "" + str.charAt(0) + noX(str.substring(1));
    }
  }
}
