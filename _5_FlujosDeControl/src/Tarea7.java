import java.util.Scanner;

public class Tarea7 {

/*  Crear una clase con el método main donde el desafío es buscar el número menor
de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar,
 luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero,
  entonces se requiere:

  Calcular el menor número e imprimir el valor.

  Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
  si no, imprimir " el numero menor es igual o mayor que 10!".*/

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[10];

    System.out.println("Ingresa 10 números enteros, por favor");
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = scanner.nextInt();
    }

    int numeroMenor = numeros[0];
    for (int i = 1; i < numeros.length; i++) {
      if (numeros[i] < numeroMenor) {
        numeroMenor = numeros[i];
      }
    }

    if (numeroMenor < 10) {
      System.out.println("El número menor es menor que 10, que es: " + numeroMenor);
    } else {
      System.out.println("El número menor es igual o mayor que 10, que es: " + numeroMenor);
    }

  }
}
