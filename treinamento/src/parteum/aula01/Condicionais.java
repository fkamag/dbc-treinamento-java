package parteum.aula01;

public class Condicionais {

  public void exemploIfElse(int a) {
    if (a > 15) {
      System.out.println("a é maior do que 15");
    } else {
      System.out.println("a é menor do que 15");
    }
  }

  public void exemploElseIf(int b) {
    if (b > 18) {
      System.out.println("b é maior do que 18");
    } else if (b >= 14) {
      System.out.println("b está entre 14 e 18");
    } else {
      System.out.println("b é menor que 14");
    }
  }

  public static void main(String[] args) {
    Condicionais condicionais = new Condicionais();
    condicionais.exemploIfElse(2);
    condicionais.exemploElseIf(14);
  }

}
