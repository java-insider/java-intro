class EvenNumbers {
  public static void main(String[] args) {
    
    int min = 10;
    int max = 60;
    
    for(int i = min; i <= max; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
