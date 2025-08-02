public boolean cigarParty(int cigars, boolean isWeekend) {
  
  if(isWeekend == false) {
    if(cigars >= 40 && cigars <= 60) {
      return true;
    }
  } else if(isWeekend == true) {
    if(cigars >= 40) {
      return true;
    }
  } else {
    return false;
  }
  return false;
}
