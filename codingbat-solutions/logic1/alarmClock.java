public String alarmClock(int day, boolean vacation) {
  
  if(vacation == false && day >= 1 && day <= 5) {
    return "7:00";
  } else if(vacation == false && (day == 6 || day == 0)) {
    return "10:00";
  } else if(vacation == true && day >= 1 && day <= 5) {
    return "10:00";
  } else if(vacation == true && (day == 6 || day == 0)) {
    return "off";
  } else {
    return "off";
  }
}
