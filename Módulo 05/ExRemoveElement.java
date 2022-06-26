import java.util.Arrays;

class ExRemoveElement {
  public static void main(String[] args) {
    
    int[] array = { 5, 3, 1, 3, 2, 6, 3, 5, 0, 3 };
    System.out.println(Arrays.toString(array));

    int remove = 3;
    int length = array.length;
    
    for (int i = 0; i  length; i++) {
      if (array[i] == remove) {
        for (int j = i + 1; j  length; j++) {
          array[j - 1] = array[j];
        }
        
        array[length - 1] = -1;
        length--;
      }
    }
    
    System.out.println(Arrays.toString(array));
  }
}
