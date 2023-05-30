import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDate {

  public static void main(String[] args) {

    Date fecha = new Date();
    System.out.println("fecha = " + fecha);

    /*En la clase SimpleDateFormat  se encuentran los formatos para
    * trabajar con la fecha*/
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM, yyyy");
    String fechaFormat = dateFormat.format(fecha);
    System.out.println("fechaFormat = " + fechaFormat);

    dateFormat.applyPattern("dd/MM/yyyy");
    fechaFormat = dateFormat.format(fecha);
    System.out.println("fechaFormat = " + fechaFormat);

    dateFormat.applyPattern("EEEE dd 'de' MMM yyyy");
    fechaFormat = dateFormat.format(fecha);
    System.out.println("fechaFormat = " + fechaFormat);


    
  }
}
