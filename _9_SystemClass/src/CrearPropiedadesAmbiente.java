import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class CrearPropiedadesAmbiente {
  public static void main(String[] args) {

    try {
      FileInputStream archivo = new FileInputStream("src/props.properties");

      Properties properties = new Properties(System.getProperties());
      properties.load(archivo);

      /*Manera alternativa sin crear el archivo properties*/
      properties.setProperty("config.puerto.server", "0001");

      System.setProperties(properties);

      System.getProperties().list(System.out);

      System.out.println(properties.getProperty("config.puerto.server"));

    } catch (IOException e) {
      e.printStackTrace();
      System.err.println("El archivo no existe");
      System.exit(1);
    }

  }
}
