public String[] wordsWithout(String[] words, String target) {
  
  int count = 0;
  int ctr = 0;
  
  for(String i: words) {
    if(i.equals(target))
      count++;
  }
  String [] strings = new String[words.length - count];
  for(int i = 0; i < words.length; i++) {
    if(!words[i].equals(target)) {
      strings[ctr] = words[i];
      ctr++;
    }
  }
  return strings;
}
