class Growth {
  public static void main(String[] args) {
    System.out.println(calculateGrowth(5, 7));
    
    int valueStart = 10;
    int x = 10;
  }
  
  static double calculateGrowth(double valueStart, double valueEnd) {
    int x = 15;
    return ((valueEnd - valueStart) / valueStart) * 100;
  }
}
