public String changeXY(String str) {
  
  int length = str.length();
  if(length == 0) {
    return str;
  } else if(length == 1) {
    if(str.equals("x")) {
      return "y";
    } else {
      return str;
    }
  } else {
    if(length > 1) {
      if(str.substring(0,1).equals("x")) {
        return "y" + changeXY(str.substring(1));
      } else {
        return "" + str.charAt(0) + changeXY(str.substring(1));
      }
    }
  }
  return "";
}