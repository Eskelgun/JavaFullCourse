public class WrapperOperadoresRelacionales {

  public static void main(String[] args) {

/*    Curiosamente existe una optimizacion que si el valor se encuentra
    en el rango de los bytes, no creará una segunda instancia del Integer,
    pero si nos pasamos si la crea (-128, 127)*/

    Integer numero1 = 128;
//    numero1 = 127;
    Integer numero2 = numero1;

    System.out.println("numero1 = " + numero1);
    System.out.println("numero2 = " + numero2);

    System.out.println("Son el mismo objeto? " + (numero1 == numero2));

    numero2 = 128;
//    numero2 = 127;
    System.out.println("numero2 = " + numero2);

    /*El '==' está comparando el valor asignado en la memoria (La instancia)*/
    System.out.println("Son el mismo objeto? " + (numero1 == numero2));

    System.out.println("Tienen el mismo valor? " + (numero1.equals(numero2)));
    System.out.println("Tienen el mismo valor? " + (numero1.intValue() == numero2.intValue()));

    /*Aplica autounboxing*/
    numero2 = 1000;
    boolean condicion = numero1 > numero2;
    System.out.println("condicion = " + condicion);

  }
}
