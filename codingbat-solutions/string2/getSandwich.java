public String getSandwich(String str) {
  
  int occur = str.indexOf("bread");
  int occur2 = str.lastIndexOf("bread");
  
  if(occur == occur2) {
    return "";
  } else {
    return str.substring(occur + 5, occur2);
  }
}
