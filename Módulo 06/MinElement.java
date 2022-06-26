class MinElement {
  public static void main(String[] args) {
    
    System.out.println("início");
    findMin();
    System.out.println("fim");
  }
  
  static void findMin() {
    int[] array = { 3, 5, 9, 12, 2 };
    int min = Integer.MAX_VALUE;
    
    for (int e : array) {
      if (e < min) {
        min = e;
      }
    }
    
    System.out.println(min);
  }
}
