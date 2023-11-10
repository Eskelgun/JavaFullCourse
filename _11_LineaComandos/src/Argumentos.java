public class Argumentos {
  public static void main(String[] args) {
    /*Los archivos en la carpeta OUT son ".class"
    estos se interpretan en BYTECODE (El lenguage intermedio que luego se transforma en binario)*/

//    Comandos:
//      - Compilar:
//      javac >nombreClase<.java
//      - Ejecutar
//      java >nombreClase<

    if(args.length == 0){
      System.err.println("No hay parámetros ingresados");
      System.exit(-1);
    }
    for (int i = 0; i < args.length; i++) {
      System.out.println("arg #" + i + ": " + args[i]);
    }

  }
}
