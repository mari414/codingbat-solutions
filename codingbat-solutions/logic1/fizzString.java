public String fizzString(String str) {
  
  int length = str.length();
  if(str.charAt(0) == 'f' && str.charAt(length - 1) == 'b') {
    return "FizzBuzz";
  } else if(str.charAt(0) == 'f') {
    return "Fizz";
  } else if(str.charAt(length - 1) == 'b') {
    return "Buzz";
  } else {
    return str;
  }
}
