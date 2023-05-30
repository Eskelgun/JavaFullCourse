import java.util.Scanner;

public class Tarea9 {

  /*Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos,
  pero sin usar el símbolo de multiplicación (*).

  Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios,
  donde menos por menos es positivo.*/

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digita dos valores para multiciplicar");

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int minimo = Math.min(Math.abs(a), Math.abs(b));
    int maximo = Math.max(Math.abs(a), Math.abs(b));

    int resultado = 0;

    for (int i = 0; i < minimo; i++) {
      resultado += maximo;
    }

    if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
        resultado = -resultado;
    }

    System.out.println("El resultado de multiplicar: " + a + " x " + b + " = " + resultado);

  }
}
