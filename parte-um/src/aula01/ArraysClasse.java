package parteum.aula01;

import java.util.Arrays;

public class ArraysClasse {

  public static void main(String[] args) {
    int[] numeros = {1, 2, 3, 4, 5};
    System.out.println(numeros[0]);

    numeros[2] = 28;
    System.out.println(Arrays.toString(numeros));

    String[] ordenarArray = {"Pafúncio", "Esmeralda", "Ana Banana", "Cláudio",
        "Zaire"};
    System.out.println(Arrays.toString(ordenarArray));
    Arrays.sort(ordenarArray);
    System.out.println("Array ordenado: " + Arrays.toString(ordenarArray));


    int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.print(matriz[i][j]);
      }
      System.out.println();
    }
  }
}
