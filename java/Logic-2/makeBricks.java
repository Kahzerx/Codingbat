public boolean makeBricks(int small, int big, int goal) {
  int r = goal >= (5 * big) ? goal - (5 * big) : goal % 5;
  return small >= r;
}
