import java.util.Arrays;

class BubbleSort {
  public static void main(String[] args) {
    int[] array = { 5, 4, 6, 2, 7, 6, 10, 7, 2, 0 };
    System.out.println(Arrays.toString(array));
    
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          int t = array[i];
          array[i] = array[j];
          array[j] = t;
        }
      }
    }
    
    System.out.println(Arrays.toString(array));
  }
}
