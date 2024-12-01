package parteum.aula01.task01;

import java.util.Scanner;

public class ParOuImpar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    String resultado = (numero & 1) == 0 ? "par" : "ímpar";

    System.out.println("O número " + numero + " é " + resultado + ".");

    scanner.close();
  }
}
