import java.util.Arrays;

class ExMultiply {
  public static void main(String[] args) {
    
    double[] array = { 0.5, 1.5, 3.0, 2.2 };
    int m = 3;
    
    for (int i = 0; i < array.length; i++) {
      //double e = array[i];
      //e = e * m;
      //array[i] = e;
      
      array[i] = array[i] * m;
    }
  	
    System.out.println(Arrays.toString(array));
  }
}
