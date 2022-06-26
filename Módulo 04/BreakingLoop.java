class BreakingLoop {
  public static void main(String[] args) {
    
    while (true) {
    	int n = (int)(Math.random() * 100) + 1;
        System.out.println(n);
      
        if (n > 50) {
          break;
        }
    }
    
    System.out.println("Encontrou número alto");
  }
}
