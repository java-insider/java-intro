class LogicalOperators {
  public static void main(String[] args) {
    
    int idade = -1;
    String categoria;
    
    if (idade > 0 && idade <= 12) {
      categoria = "CRIANÇA";
    } else if (idade > 12 && idade <= 17) {
      categoria = "ADOLESCENTE";
    } else if (idade > 17) {
      categoria = "ADULTO";
    } else {
      categoria = "DESCONHECIDO";
    }
    
    System.out.println("Categoria para " + idade + " anos: " + categoria);
  }
}
