class VariableScope {
  public static void main(String[] args) {
    
    int v1 = 1;
    
    while (v1 > 10) {
      int v2 = 10;
      v1++;
    }
    
    //System.out.println(v2);
    
    int i = 0;
    for (; i < 10; i++) {
      System.out.println(i);
    }
    
    System.out.println("=>" + i);
  }
}
