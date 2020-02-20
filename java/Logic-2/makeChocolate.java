public int makeChocolate(int small, int big, int goal) {
  int r = goal >= 5 * big ? goal - (5 * big) : goal % 5;
  return r <= small ? r : -1;
}
