public class ExtensionArchivo {

  public static void main(String[] args) {
    
    String archivo = "MI.HV.JPEG";
    int puntoFinal = archivo.lastIndexOf('.');
    System.out.println("archivo.length() = " + archivo.length());
    System.out.println("archivo.substring(puntoFinal + 1) = " + archivo.substring(puntoFinal + 1));
    
  }
}
