import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class utilCalendar {

  public static void main(String[] args) {

    Calendar calendar = Calendar.getInstance();
    Date fecha = calendar.getTime();
    System.out.println("fecha = " + fecha);
    System.out.println("calendar = " + calendar);

//    calendar.set(2020, 0, 23);
    calendar.set(2020, Calendar.JANUARY, 23);
    fecha = calendar.getTime();
    System.out.println("fecha = " + fecha);

    calendar.set(Calendar.YEAR, 1998);
    calendar.set(Calendar.MONTH, Calendar.AUGUST);
    calendar.set(Calendar.DAY_OF_MONTH, 3);
//    calendar.set(Calendar.HOUR_OF_DAY, 20);
    calendar.set(Calendar.HOUR, 8);
    calendar.set(Calendar.AM_PM, Calendar.PM);
    calendar.set(Calendar.MINUTE, 30);
    calendar.set(Calendar.SECOND, 10);
    fecha = calendar.getTime();
    System.out.println("fecha = " + fecha);


    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
    String fechaEspecifica = dateFormat.format(fecha);
    System.out.println("fechaEspecifica = " + fechaEspecifica);

  }
}
