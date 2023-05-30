import java.util.Map;

public class VariablesEntornoSistema {

  public static void main(String[] args) {
    
    Map<String, String> mapValores = System.getenv();
    System.out.println("mapValores = " + mapValores);


    String java = System.getenv("JAVA_HOME");
    System.out.println("java = " + java);

    /*Este metodo dispara el GARBAGE COLLECTOR*/
    System.gc();

    /*Este metodo indica la finalización del programa
    * y recibe el numero de errores*/
    System.exit(0);
  }
}
