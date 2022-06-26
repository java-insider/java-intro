class ExFibonacci {
  public static void main(String[] args) {
    
    int a = 1;
    int b = 1;
    
    System.out.println(a);
    System.out.println(b);
    
    for (int i = 3; i <= 15; i++) {
      int p = a + b;
      System.out.println(p);
      
      b = a;
      a = p;
    }
  }
}
