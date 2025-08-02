
public int strDist(String str, String sub) {
  if(str.length() == 1 && str.equals(sub))
    return 1;
  else if(str.length() < sub.length() || str.length() <= 1)
    return 0;
  else {
    if(str.charAt(0) == sub.charAt(0) && str.charAt(0) == str.charAt(str.length() - sub.length()) 
        && str.substring(str.length() - sub.length(), str.length()).equals(sub) 
        && str.substring(str.length() - sub.length()).equals(sub))
      return str.length();
    else {
      if(str.substring(0, sub.length()).equals(sub))
        return strDist(str.substring(0, str.length() - 1), sub);
      else if(str.substring(str.length() - sub.length(), str.length()).equals(sub))
        return strDist(str.substring(1, str.length()), sub);
  return strDist(str.substring(1, str.length() - 1), sub);
    }
  }
}