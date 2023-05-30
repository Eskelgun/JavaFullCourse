import java.util.Scanner;

public class Tarea2 {
  /*Se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner*/
  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa nombre de la factura o descripción");
    String factura = scanner.nextLine();

    System.out.println("Ingrese el primer precio");
    double primerPrecio = scanner.nextDouble();

    System.out.println("Ingrese el segundo precio");
    double segundoPrecio = scanner.nextDouble();

    double totales = primerPrecio + segundoPrecio;
    System.out.println("Valor sin impuestos = " + totales);
    double impuesto = totales * 0.19;
    System.out.println("impuesto = " + impuesto);
    double resultadoFinal = totales * 1.19;
    System.out.println("resultadoFinal = " + resultadoFinal);

    System.out.println("La factura con detalles de: "+ factura
    + " tiene un valor bruto de: " + totales
    + " un valor de impuestos de: "+ impuesto
    + " y un valor TOTAL de: "+ resultadoFinal);

  }

}
