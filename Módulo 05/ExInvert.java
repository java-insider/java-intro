import java.util.Arrays;

class ExInvert {
  public static void main(String[] args) {
    
    String[] a = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
    String[] b = new String[a.length];
    
    for (int i = a.length - 1; i >= 0; i--) {
      b[a.length - 1 - i] = a[i];
    }
    
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
  }
}
