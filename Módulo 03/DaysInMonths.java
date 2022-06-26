class DaysInMonths {
  public static void main(String[] args) {
    
    int month = 4;
    int numDays;
    
    if (month == 2) {
      numDays = 28;
    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
      numDays = 31;
    } else {
      numDays = 30;
    }
    
    System.out.println("O mês " + month + " possui " + numDays + " dias.");
  }
}
