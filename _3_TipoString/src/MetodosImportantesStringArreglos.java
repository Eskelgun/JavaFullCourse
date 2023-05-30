public class MetodosImportantesStringArreglos {

  public static void main(String[] args) {

    String trabalenguas = "trabalenguas";
    System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
    System.out.println("trabalenguas.length() = " + trabalenguas.length());
    
    char[] arreglo = trabalenguas.toCharArray();
    for(int i = 0; i < arreglo.length; i++){
      System.out.print(arreglo[i]);
    }

    System.out.println("- - - - - - - - - - - - - -");

    System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
    String[] splitArreglo = trabalenguas.split("a");
    for(int i = 0; i < splitArreglo.length; i++){
      System.out.println(splitArreglo[i]);
    }

    System.out.println("- - - - - - - - - - - - - -");
    String archivo = "MI.HV.JPEG";

    /*El punto . es un caracter especial para los regex (expresion regular)*/
//    String[] splitArchivo = archivo.split("\\.");
    String[] splitArchivo = archivo.split("[.]");
    for(int i = 0; i < splitArchivo.length; i++){
      System.out.println(splitArchivo[i]);
    }
    System.out.println("splitArchivo[splitArchivo.length - 1] = " + splitArchivo[splitArchivo.length - 1]);

    
  }
  
}
