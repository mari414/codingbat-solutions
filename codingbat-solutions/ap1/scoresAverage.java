public int scoresAverage(int[] scores) {
  
  if(average(scores, 0, scores.length / 2) > average(scores, scores.length / 2, scores.length))
    return average(scores, 0, scores.length / 2);
  return average(scores, scores.length / 2, scores.length);
}
public int average(int [] scores, int start, int end) {
  int sum = 0;
  int ctr = 0;
  for (int i = start; i < end; i++) {
    sum += scores[i];
    ctr++;
  }
  return sum / ctr;
}
