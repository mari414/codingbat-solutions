public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  
  if (!noDoubles) 
    return die1 + die2;
  if (die1 == die2) 
    return (die1 != 6) ? die1 + die2 + 1 : die1 + 1;
  return die1 + die2;
}
