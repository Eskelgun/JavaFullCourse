import javax.swing.*;
import java.util.Scanner;

public class EntradasVentanaDialogo {

  public static void main(String[] args) {

    String valorEntrada = JOptionPane.showInputDialog(null,"Ingresa un número entero");
    int  numeroDecimal = -1;
    try {
      numeroDecimal = Integer.parseInt(valorEntrada);
    }catch (NumberFormatException e){
      JOptionPane.showMessageDialog(null, "Ingrese un número valido");
      main(args);

//      Indica salir del metodo sin errores
//      System.exit(0);
      return;
    }


    System.out.println("numeroDecimal " + numeroDecimal + " a Binario "+ Integer.toBinaryString(numeroDecimal));

//    0B es binario
    int numeroBinario = 0b10100;
    System.out.println("numeroBinario = " + numeroBinario);

//    0'número' es octal
    int numeroOctal = 024;
    System.out.println("numeroOctal = " + numeroOctal);
    System.out.println("numeroDecimal " + numeroDecimal + " a Octal "+ Integer.toOctalString(numeroDecimal));

//    0X es hexadecimal
    int numeroHexadecimal = 0X14;
    System.out.println("numeroHexadecimal = " + numeroHexadecimal);
    System.out.println("numeroDecimal " + numeroDecimal + " a Hexagonal "+ Integer.toHexString(numeroDecimal));

    String mensaje = "numeroDecimal " + numeroDecimal + " a Binario "+ Integer.toBinaryString(numeroDecimal) ;
    mensaje += "\n numeroDecimal " + numeroDecimal + " a Octal "+ Integer.toOctalString(numeroDecimal)
            + "\n numeroDecimal " + numeroDecimal + " a Hexagonal "+ Integer.toHexString(numeroDecimal);

    JOptionPane.showMessageDialog(null, mensaje);

  }
}
