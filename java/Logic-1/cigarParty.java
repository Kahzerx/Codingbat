public boolean cigarParty(int cigars, boolean isWeekend) {
  return isWeekend ? 40 <= cigars : 40 <= cigars && cigars <= 60;
}
