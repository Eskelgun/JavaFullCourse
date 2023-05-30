import java.util.Scanner;

public class NombreDelMes {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite un número del mes");
    int mes = scanner.nextInt();
    String nombreMes = null;

    switch (mes) {
      case 1:
        nombreMes = "Enero";
        break;
      case 2:
        nombreMes = "Febrero";
        break;
      case 3:
        nombreMes = "Marzo";
        break;
      case 4:
        nombreMes = "Abril";
        break;
      case 5:
        nombreMes = "Mayo";
        break;
      case 6:
        nombreMes = "Junio";
        break;
      case 7:
        nombreMes = "Julio";
        break;
      case 8:
        nombreMes = "Agosto";
        break;
      case 9:
        nombreMes = "Septiembre";
        break;
      case 10:
        nombreMes = "Octubre";
        break;
      case 11:
        nombreMes = "Noviembre";
        break;
      case 12:
        nombreMes = "Diciembre";
        break;
      default:
        nombreMes = "Número de mes no es correcto";
    }

    /*    Otra forma de hacer lo anterior*/
//    nombreMes = switch (mes) {
//      case 1 -> "Enero";
//      case 2 -> "Febrero";
//      case 3 -> "Marzo";
//      case 4 -> "Abril";
//      case 5 -> "Mayo";
//      case 6 -> "Junio";
//      case 7 -> "Julio";
//      case 8 -> "Agosto";
//      case 9 -> "Septiembre";
//      case 10 -> "Octubre";
//      case 11 -> "Noviembre";
//      case 12 -> "Diciembre";
//      default -> "Número de mes no es correcto";
//    };

    System.out.println(nombreMes);
  }
}
