class ExLeapYear {
  public static void main(String[] args) {
    System.out.println("2000 -> " + isLeapYear(2000));
    System.out.println("400 -> " + isLeapYear(400));
    System.out.println("1 -> " + isLeapYear(1));
    System.out.println("1990 -> " + isLeapYear(1990));
  }
  
  static boolean isLeapYear(int year) {
    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
      return true;
    }
    
    return false;
  }
}
