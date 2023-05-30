public class OperadorInstanceOfGenericos {

  public static void main(String[] args) {

    Object texto = "Hola";
    Number numero = 100.12F;

//    Autoboxing se llama cuando creas una instancia con un valor literal
    Integer entero = 7;

//    Java utiliza el valueOf para crear la instancia del Autoboxing
    Integer entero2 = Integer.valueOf(7);

    boolean textoBooleano = texto instanceof String;
    System.out.println("texto es TIPO String? = " + textoBooleano);

    textoBooleano = texto instanceof Object;
    System.out.println("texto es TIPO Object? = " + textoBooleano);

    textoBooleano = texto instanceof Integer;
    System.out.println("texto es TIPO Integer? = " + textoBooleano);

    boolean numeroBooleano = numero instanceof Integer;
    System.out.println("numero es TIPO Integer? = " + numeroBooleano);

    numeroBooleano = numero instanceof Object;
    System.out.println("numero es TIPO Object? = " + numeroBooleano);

    numeroBooleano = numero instanceof Double;
    System.out.println("numero es TIPO Double? = " + numeroBooleano);

    numeroBooleano = numero instanceof Long;
    System.out.println("numero es TIPO Long? = " + numeroBooleano);

   }
}
