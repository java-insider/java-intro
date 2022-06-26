class StringManipulation {
  public static void main(String[] args) {
    
    String s1 = "eu gosto ";
    String s2 = "de Java";
    String s3 = s1 + s2;
    String s4 = s3.toUpperCase();
    String s5 = s4.substring(5);
    String s6 = s4.substring(5, 7);
    
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
  }
}
