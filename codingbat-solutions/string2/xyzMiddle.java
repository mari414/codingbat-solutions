public boolean xyzMiddle(String str) {
  
  for(int i = 0; i < str.length(); i++) {
    if(i + 3 > str.length()) {
    } else {
      if(str.substring(i, i + 3).equals("xyz") && (i == str.length() - (i + 3) || i - 1 == str.length() - (i + 3) 
          || i + 1 == str.length() - (i + 3))) {
        return true;
      }
    }
  } 
  return false;
}
