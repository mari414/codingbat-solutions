public boolean equalIsNot(String str) {
  
  int isCount = 0;
  int notCount = 0;
  
  str += "x";
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.length() >= 2 && str.substring(i, i + 2).equals("is"))
      isCount++;
    if(str.length() >= 3 && str.substring(i, i + 3).equals("not"))
      notCount++;
  }
  
  return (isCount == notCount);
}
