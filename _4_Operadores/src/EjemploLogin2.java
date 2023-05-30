import java.util.Scanner;

public class EjemploLogin2 {

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

    /*LOS ARREGLOS SÓLO SE PUEDEN INICIALIAZAR UNA ÚNICA VEZ.*/
    String[] listUsuarios = {usuario, usuario2};
    String[] listContrasenas = {contrasena, contrasena2};
//    listContrasenas[3] = "123abc"; //DA ERROR PORQUE EL ARREGLO FUE INICIALIZADO CON 2 VALORES, SU TAMAÑO SERÁ SIEMPRE DE 2.

    for (int i = 0; i < listUsuarios.length; i++) {
      esValido = (listUsuarios[i].equalsIgnoreCase(usuarioIngresado) && listContrasenas[i].equalsIgnoreCase(contrasenaIngresada))
              ? true
              : esValido;

      /*El break no es opción aquí pues se saldría en el primer recorrido*/
//        break;
    }

    String mensaje = (esValido)
            ? "El usuario está autenticado." : "El usuario no es valido";

    System.out.println(mensaje);
  }

}

