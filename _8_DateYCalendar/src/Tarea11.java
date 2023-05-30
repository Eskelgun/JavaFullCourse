import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tarea11 {

/*  Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una
  fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.*/

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa una fecha con formato dd-mm-yyyy");
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Date date = null;
    try {
      date = dateFormat.parse(scanner.next());
    } catch (ParseException e) {
      e.printStackTrace();
      return;
    }

    Calendar fecha = Calendar.getInstance();
    fecha.setTime(date);

    Calendar fechaActual = Calendar.getInstance();
    fechaActual.get(Calendar.YEAR);

    int edad = fechaActual.get(Calendar.YEAR) - fecha.get(Calendar.YEAR);
    if (fecha.get(Calendar.MONTH) > fechaActual.get(Calendar.MONTH) ||
            (fecha.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH)
                    && fecha.get(Calendar.DAY_OF_MONTH) > fechaActual.get(Calendar.DAY_OF_MONTH))) {
      edad--;
    }
    System.out.println("Su edad es: " + edad);

    getEdad();

  }

  private static void getEdad() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese un fecha de nacimiento con formato dd-mm-yyyy:");
    String fechaStr = scanner.next();

    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    Date fechaNacimiento = null;
    try {
      fechaNacimiento = df.parse(fechaStr);
    } catch (ParseException e) {
      e.printStackTrace();
      return;
    }
    Date actual = new Date();

    // creamos un patron de fecha numérico con el año mes y día
    df = new SimpleDateFormat("yyyyMMdd");

    // luego convertimos ambas fechas la actual y la fecha de nacimiento
    // en enteros que contiene el año mes y día
    int desde = Integer.parseInt(df.format(fechaNacimiento));
    int hasta = Integer.parseInt(df.format(actual));

    // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
    // dejar la fecha en decenas o centenas
    int edad = (hasta - desde) / 10000;
    System.out.println("La edad es: " + edad);
  }

}
