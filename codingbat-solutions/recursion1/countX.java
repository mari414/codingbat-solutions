public int countX(String str) {
  
  int length = str.length();
  if (length == 0) {
    return 0;
  } else if (length == 1) {
    if(str.charAt(0) == 'x') {
      return 1;
    }
  } else {
    if(str.charAt(0) == 'x') {
      return 1 + countX(str.substring(1));
    } else {
      return countX(str.substring(1));
    }
  }
  return 0;
}
