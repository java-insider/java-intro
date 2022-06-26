class ExFutureValue {
  public static void main(String[] args) {
    
    double pv = 30000;
    double i = 0.02;
    int n = 12;
    
    double fv = pv * Math.pow(1 + i, n);
    System.out.println("Valor final: " + fv);
  }
}
