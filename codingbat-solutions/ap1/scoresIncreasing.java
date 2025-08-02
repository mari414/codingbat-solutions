public boolean scoresIncreasing(int[] scores) {
  
int count = 0;
for(int i = 0; i < scores.length - 1; i++) {
  if(scores[i] <= scores[i + 1])
    count++;
} 
if(count == scores.length - 1)
  return true;
return false;
}
