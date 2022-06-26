class ForEachIteration {
  public static void main(String[] args) {
    
    double[] grades = new double[4];
    grades[0] = 8.5;
    grades[1] = 7.0;
    grades[2] = 7.5;
    grades[3] = 6.0;
    
    for (double g : grades) {
      System.out.println("-> " + g);
    }
  }
}
