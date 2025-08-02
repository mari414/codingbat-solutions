public String[] fizzBuzz(int start, int end) {
  
  String [] fb = new String[end - start];
  int count = 0;
  
  for(int i = start; i < end; i++) {
    if(i % 3 == 0 && i % 5 == 0) 
      fb[count] = "FizzBuzz";
    else if(i % 3 == 0) 
      fb[count] = "Fizz";
    else if(i % 5 == 0) 
      fb[count] = "Buzz";
    else 
      fb[count] = String.valueOf(i);
    count++;
  }
  return fb;
}
