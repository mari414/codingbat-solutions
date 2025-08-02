public int countHi(String str) {
  
  int length = str.length();
  if(length == 0 || length == 1) {
    return 0;
  } else {
    if(str.substring(0, 2).equals("hi")) {
      return 1 + countHi(str.substring(2));
    } else {
      return countHi(str.substring(1));
    }
  }
}
