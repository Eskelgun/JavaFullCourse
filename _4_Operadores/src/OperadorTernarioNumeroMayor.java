import java.util.Arrays;
import java.util.Scanner;

public class OperadorTernarioNumeroMayor {

  public static void main(String[] args) {

    int maxValue = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa un número");
    int numero1 = scanner.nextInt();

    System.out.println("Ingresa un número");
    int numero2 = scanner.nextInt();

    System.out.println("Ingresa un número");
    int numero3 = scanner.nextInt();

    System.out.println("Ingresa un número");
    int numero4 = scanner.nextInt();

    int[] numeros = {numero1, numero2, numero3, numero4};

    int i = 0;
    maxValue = numeros[numeros.length - 1];
    while (i < numeros.length - 1) {
      maxValue = (numeros[i] > numeros[i + 1])
              ? numeros[i] : maxValue;
      i++;
    }
    System.out.println("maxValue = " + maxValue);

  }
}
