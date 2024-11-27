package aula02;

import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int option;

    do {
      System.out.println("""
                   Menu
          =======================
          1 - Opção 1
          2 - Opção 2
          0 - Sair
          """);
      System.out.print("Escolha uma opção: ");
      option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("Você escolheu opção 1");
          break;
        case 2:
          System.out.println("Você escolheu opção 2");
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida. Digite novamente");
      }
    } while (option !=0);
  }

}
