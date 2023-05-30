import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradasConsola {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa un número entero:");
//    nextLine captura String
//    String valorEntrada = scanner.nextLine();
    int  numeroDecimal = -1;
    try {
      numeroDecimal = scanner.nextInt();
    }catch (InputMismatchException e){
      System.out.println("Ingrese un número valido");
      main(args);

//      Indica salir del metodo sin errores
//      System.exit(0);
      return;
    }

    String mensaje = "numeroDecimal " + numeroDecimal + " a Binario "+ Integer.toBinaryString(numeroDecimal) ;
    mensaje += "\n"+"numeroDecimal " + numeroDecimal + " a Octal "+ Integer.toOctalString(numeroDecimal)
            +"\n"+"numeroDecimal " + numeroDecimal + " a Hexagonal "+ Integer.toHexString(numeroDecimal);

    System.out.println(mensaje);

  }
}
