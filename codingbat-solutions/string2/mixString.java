public String mixString(String a, String b) {
  
  String added = "";
  int minimum = 0;
  if(a.length() < b.length()) {
    minimum = a.length();
    for (int i = 0; i < minimum; i++) {
      added += "" + a.charAt(i) + b.charAt(i);
    }
    return added + b.substring(a.length());
  } else {
    minimum = b.length();
    for (int i = 0; i < minimum; i++) {
      added += "" + a.charAt(i) + b.charAt(i);
    }
    return added + a.substring(b.length());
  }
}
