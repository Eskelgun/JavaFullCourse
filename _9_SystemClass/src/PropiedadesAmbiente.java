import java.util.Properties;

public class PropiedadesAmbiente {
  public static void main(String[] args) {
    
    String usuarioSistema = System.getProperty("user.name");
    System.out.println("usuarioSistema = " + usuarioSistema);


    String home = System.getProperty("user.home");
    System.out.println("home = " + home);

    String workSpace = System.getProperty("user.dir");
    System.out.println("workSpace = " + workSpace);

    String javaVersion = System.getProperty("java.version");
    System.out.println("javaVersion = " + javaVersion);

    String lineSeparator = System.getProperty("line.separator");
    System.out.println("lineSeparator: " + lineSeparator + "Linea nueva");

    String lineSeparator2 = System.lineSeparator();
    System.out.println("lineSeparator: " + lineSeparator2 + "Linea nueva2");

    Properties p = System.getProperties();
    p.list(System.out);
  }
}
