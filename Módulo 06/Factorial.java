class Factorial {
  public static void main(String[] args) {
    System.out.println(fat(10));
  }
  
  static int fat(int n) {
    if (n == 1) {
      return 1;
    }
    
    return n * fat(n - 1);
  }
}
