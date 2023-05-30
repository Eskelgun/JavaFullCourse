import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringParseDate {

  public static void main(String[] args) {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa una fecha con formato año-mes-dia (2020-08-21)");
    try {
      Date fecha = dateFormat.parse(scanner.next());
      System.out.println("fecha = " + fecha);
      System.out.println("dateFormat = " + dateFormat.format(fecha));

      Date fechaActual = new Date();
      System.out.println("fechaActual = " + fechaActual);

      /*Forma 1 de comparar*/
      if (fecha.after(fechaActual)) {
        System.out.println("La fecha ingresada es despues de la fecha actual");
      }else if(fecha.before(fechaActual)) {
        System.out.println("La fecha ingresada es anterior de la fecha actual");
      }else {
        System.out.println("Las fechas son del día actual");
      }

      /*Forma 2 de comparar*/
      if (fecha.compareTo(fechaActual) > 0) {
        System.out.println("La fecha ingresada es despues de la fecha actual");
      }else if(fecha.compareTo(fechaActual) < 0) {
        System.out.println("La fecha ingresada es anterior de la fecha actual");
      }else {
        System.out.println("Las fechas son del día actual");
      }

    } catch (ParseException e) {
      e.printStackTrace();
    }

  }
}
