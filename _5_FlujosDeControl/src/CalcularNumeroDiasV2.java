import java.util.Scanner;

public class CalcularNumeroDiasV2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite un número del mes");
    int mes = scanner.nextInt();

    System.out.println("Digite un número del año");
    int year = scanner.nextInt();

    int numeroDias = 0;

//    Se pueden separar distintos case por coma ',' o acumulando una pila de cases
    switch (mes) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        numeroDias = 31;
        break;
      case 4, 6, 9, 11:
        numeroDias = 30;
        break;
      case 2:
        if (year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0)) {
          numeroDias = 29;
        } else {
          numeroDias = 28;
        }
        break;
      default:
        numeroDias = -1;
    }

    System.out.println(numeroDias);

  }
}
