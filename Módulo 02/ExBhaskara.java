class ExBhaskara {
  public static void main(String[] args) {
    
    int a = 3;
    int b = 0;
    int c = -27;
    
    double delta = b * b - 4 * a * c;
    
    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
    
    System.out.println("x1 = " + x1);
    System.out.println("x2 = " + x2);
  }
}
