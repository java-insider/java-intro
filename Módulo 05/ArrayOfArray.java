class ArrayOfArray {
  public static void main(String[] args) {
    
    //String[][] array = new String[2][3];
    String[][] array = { 
      { "A", "B", "C" }, 
      { "D", "E", "F" } 
    };
    
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
