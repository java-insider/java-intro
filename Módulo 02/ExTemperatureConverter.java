class ExTemperatureConverter {
  public static void main(String[] args) {
    
    double tf = 84.5;
    
    double tc = (tf - 32) / 9 * 5;
    System.out.println("A temperatura em Celsius é: " + tc);
  }
}
