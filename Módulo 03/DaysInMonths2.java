class DaysInMonths2 {
  public static void main(String[] args) {
    //Ano Bissexto:
    // 1. Divisível por 400; ou
    // 2. Divisível por 4 e não divisível por 100
    
    int month = 2;
    int year = 800;
    int numDays;
    
    if (month == 2) {
      if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
        numDays = 29;
      } else {
        numDays = 28;
      }
    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
      numDays = 31;
    } else {
      numDays = 30;
    }
    
    System.out.println("O mês " + month + " possui " + numDays + " dias.");
  }
}
