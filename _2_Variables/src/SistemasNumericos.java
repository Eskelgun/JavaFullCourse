public class SistemasNumericos {

  public static void main(String[] args) {

    int  numeroDecimal = 20;

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

  }
}
