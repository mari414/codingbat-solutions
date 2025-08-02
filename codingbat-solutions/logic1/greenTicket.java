public int greenTicket(int a, int b, int c) {
   if (a != b && a != c && c != b) return 0;
    return (a == b && b == c) ? 20 : 10;

}
