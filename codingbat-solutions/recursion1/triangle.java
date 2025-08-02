public int triangle(int rows) {
  
  if (rows == 0) {
    return 0;
  } else if (rows == 1) {
    return 1;
  } else if (rows == 2) {
    return 3;
  } else {
    return triangle(rows -1) + (rows);
  }
}
