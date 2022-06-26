class ExTriangleSurface {
  public static void main(String[] args) {
    System.out.println(calculateSurface(5, 3));
  }
  
  static double calculateSurface(double base, double height) {
    return base * height * 0.5;
  }
}
