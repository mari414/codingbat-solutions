public int teaParty(int tea, int candy) {
  
  if((tea >= candy * 2 || candy >= tea * 2) && (tea >= 5 && candy >= 5))
    return 2;
  else if(tea >= 5 && candy >= 5)
    return 1;
  else
    return 0;
}
