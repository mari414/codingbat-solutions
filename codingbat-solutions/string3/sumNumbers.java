public int sumNumbers(String str) {
  
  String temp = "";
  int sum = 0;
  int ctr = 0;
  int i = 0;
  while(i < str.length()) {
    char letter = str.charAt(i);
    while(Character.isDigit(letter)) {
      temp += letter + "";
      i++;
      if(i >= str.length()) break;
      letter = str.charAt(i);
    }
    if(!temp.equals(""))
      sum += Integer.parseInt(temp);
    temp = "";
    i++;
  }
  return sum;
}
