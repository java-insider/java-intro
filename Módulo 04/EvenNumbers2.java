class EvenNumbers2 {
  public static void main(String[] args) {
    
    int min = 10;
    int max = 40;
    
    int i = min;
    
    while (i <= max) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
      i++;
    }
  }
}
