import java.io.IOException;

public class EjecutarAplicacionSO {

  public static void main(String[] args) {

    Runtime runtime = Runtime.getRuntime();
    Process proceso;

    if(System.getProperty("os.name").toLowerCase().contains("windows")){
      try {
        proceso = runtime.exec("notepad1");
        proceso.waitFor();
      } catch (IOException | InterruptedException e) {
        e.printStackTrace();
        Thread.currentThread().interrupt();
        System.exit(1);
      }
    }

    System.out.println("Ha finalizado el proceso");

  }
}
