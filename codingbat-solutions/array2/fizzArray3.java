public int[] fizzArray3(int start, int end) {
  
    int[] arr = new int[end - start];
    
    for(int i = start; i < end; i++)
        arr[i - start] = i;
              
    return arr;
}
