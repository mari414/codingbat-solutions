public boolean endOther(String a, String b) {
  
  int one = a.length();
  int two = b.length();
  if (one <= two) { 
    return (b.toLowerCase().substring(two-one, two).equals(a.toLowerCase())); 
  }
  else {
    return(a.toLowerCase().substring(one-two, one).equals(b.toLowerCase())); 
  }
}
