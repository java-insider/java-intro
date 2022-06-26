class ExFinePaymentCalculation {
  public static void main(String[] args) {
    
    int speed = 110;
    double amount;
    
    if (speed <= 80) {
      amount = 0;
    } else if (speed > 80 && speed <= 100) {
      amount = 67;
    } else {
      amount = 70 + (speed - 100) * 10;
    }
    
    System.out.println("Valor da multa = R$ " + amount);
  }
}
