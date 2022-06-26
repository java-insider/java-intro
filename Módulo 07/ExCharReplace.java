class ExCharReplace {
  public static void main(String[] args) {
    
    System.out.println(replaceText("Eu gosto de Python", "Python", "Java"));
    System.out.println(replaceText("A senha é: xpto", "xpto", "****"));
    System.out.println(replaceText(null, "a", "b"));
    System.out.println(replaceText("", "a", "b"));    
  }
  
  static String replaceText(String stringToReplace, String stringToFind, String stringReplacement) {
    if (stringToReplace == null || stringToReplace.length() == 0) {
      return stringToReplace;
    }
    
    return stringToReplace.replace(stringToFind, stringReplacement);
  }
}
