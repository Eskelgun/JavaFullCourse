public class PrimitivosNumerosEnteros {

  public static void main(String[] args) {

    byte numeroByte = 127;
    System.out.println("numeroByte = " + numeroByte);
    System.out.println("Tipo Byte corresponde en Bytes a " + Byte.BYTES);
    System.out.println("Tipo Byte corresponde en Bites a " + Byte.SIZE);
    System.out.println("Valor máximo de un Byte es " + Byte.MAX_VALUE);
    System.out.println("Valor mínimo de un Byte es " + Byte.MIN_VALUE);

    System.out.println("- - - - - - - - - - - - - - - - - - - -");

    short numeroShort = 32767;
    System.out.println("numeroShort = " + numeroShort);
    System.out.println("Tipo Short corresponde en Bytes a " + Short.BYTES);
    System.out.println("Tipo Short corresponde en Bites a " + Short.SIZE);
    System.out.println("Valor máximo de un Short es " + Short.MAX_VALUE);
    System.out.println("Valor mínimo de un Short es " + Short.MIN_VALUE);

    System.out.println("- - - - - - - - - - - - - - - - - - - -");

    int numeroInteger = 2147483647;
    System.out.println("numeroInteger = " + numeroInteger);
    System.out.println("Tipo Integer corresponde en Bytes a " + Integer.BYTES);
    System.out.println("Tipo Integer corresponde en Bites a " + Integer.SIZE);
    System.out.println("Valor máximo de un Integer es " + Integer.MAX_VALUE);
    System.out.println("Valor mínimo de un Integer es " + Integer.MIN_VALUE);


    System.out.println("- - - - - - - - - - - - - - - - - - - -");


//    La literal por defecto es un Integer, por eso hay que indicar que es un Long con la 'L'
//    long numeroLong = 2147483648;
    long numeroLong = 9223372036854775807L;
    System.out.println("numeroLong = " + numeroLong);
    System.out.println("Tipo Long corresponde en Bytes a " + Long.BYTES);
    System.out.println("Tipo Long corresponde en Bites a " + Long.SIZE);
    System.out.println("Valor máximo de un Long es " + Long.MAX_VALUE);
    System.out.println("Valor mínimo de un Long es " + Long.MIN_VALUE);

    System.out.println("- - - - - - - - - - - - - - - - - - - -");

//    Sigue siendo en la literal un integer así el valor sea un '1'
    var numeroVar = 2147483647;
    System.out.println("numeroVar = " + numeroVar);
  }
}
