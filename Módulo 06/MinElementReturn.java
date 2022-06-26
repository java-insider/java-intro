class MinElementReturn {
  public static void main(String[] args) {
    int min1 = findMin(new int[]{ 1, 6, 9 });
    System.out.println(min1);
    
    int min2 = findMin(new int[]{ -1, 6, -5 });
    System.out.println(min2);
    
    int min3 = findMin(new int[]{ 5, 4 });
    System.out.println(min3);
  }
  
  static int findMin(int[] array) {
    int min = Integer.MAX_VALUE;
    
    for (int e : array) {
      if (e < min) {
        min = e;
      }
    }
    
    return min;
  }
}
