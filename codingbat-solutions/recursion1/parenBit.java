public String parenBit(String str) {
  
  if(str.length() < 3)
    return str;
  if(str.charAt(0) != '(')
    return parenBit(str.substring(1));
  return (str.substring(0, str.indexOf(")") + 1));
}
