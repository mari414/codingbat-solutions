public int makeChocolate(int small, int big, int goal) {
  
  while (goal >= 5 && big > 0) {
    goal -= 5; 
    big--;     
  }
  if (goal <= small)
    return goal; 
  else return -1;
}
