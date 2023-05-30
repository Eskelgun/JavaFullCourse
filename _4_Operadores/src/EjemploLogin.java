import java.util.Scanner;

public class EjemploLogin {

  public static void main(String[] args) {

    String usuario = "David";
    String contrasena = "david098";

    String usuario2 = "adm";
    String contrasena2 = "123";

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa el usuario.");
    String usuarioIngresado = scanner.nextLine();

    System.out.println("Ingrese la contraseña");
    String contrasenaIngresada = scanner.nextLine();

    boolean esValido = false;

//    if(usuario.equalsIgnoreCase(usuarioIngresado) && contrasena.equalsIgnoreCase(contrasenaIngresada)
//    || usuario2.equalsIgnoreCase(usuarioIngresado) && contrasena2.equalsIgnoreCase(contrasenaIngresada)){
//      esValido = true;
//    }
//
//    if(esValido){
//      System.out.println("El usuario está autenticado.");
//    }else {
//      System.out.println("El usuario no es valido");
//    }

    /*USANDO ARREGLOS*/
        /*DECLARACIÓN #1*/

//    String[] listUsuarios = new String[2];
//    listUsuarios[0] = usuario;
//    listUsuarios[1] = usuario2;
//
//    String[] listContrasenas = new String[2];
//    listContrasenas[0] = contrasena;
//    listContrasenas[1] = contrasena2;

      /*DECLARACIÓN #2*/

    /*LOS ARREGLOS SÓLO SE PUEDEN INICIALIAZAR UNA ÚNICA VEZ.*/
    String[] listUsuarios = {usuario, usuario2};
    String[] listContrasenas = {contrasena, contrasena2};
//    listContrasenas[3] = "123abc"; //DA ERROR PORQUE EL ARREGLO FUE INICIALIZADO CON 2 VALORES, SU TAMAÑO SERÁ SIEMPRE DE 2.


    for (int i = 0; i < listUsuarios.length; i++) {
      if (listUsuarios[i].equalsIgnoreCase(usuarioIngresado) && listContrasenas[i].equalsIgnoreCase(contrasenaIngresada)) {
        esValido = true;
        break;
      }
    }

    if (esValido) {
      System.out.println("El usuario está autenticado.");
    } else {
      System.out.println("El usuario no es valido");
    }


  }
}
