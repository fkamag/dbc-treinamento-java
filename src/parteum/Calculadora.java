package parteum;

import java.util.Scanner;

public class Calculadora {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int a = scanner.nextInt();
    System.out.println("Digite o segundo número: ");
    int b = scanner.nextInt();
    System.out.println("Operações Disponíveis");
    System.out.println("---------------------");
    System.out.println("1 - Adição");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    System.out.println("Escolha a opção desejada: ");
    int oper = scanner.nextInt();
    int total = 0;

    switch (oper){
      case 1:
        total = a + b;
        System.out.println("Valor da Adição: " + total);
        break;
      case 2:
        total = a - b;
        System.out.println("Valor da Subtração: " + total);
        break;
      case 3:
        total = a * b;
        System.out.println("Valor da Multiplicação: " + total);
        break;
      case 4:
        total = a / b;
        System.out.println("Valor da Divisão: " + total);
        break;
      default:
        System.out.println("Opção inválida");
    }


    scanner.close();

  }


}
