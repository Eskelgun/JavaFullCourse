public class OperadorInstanceOf {

  public static void main(String[] args) {

    /*LOS PRIMITIVOS NO CUENTAN COMO UN INSTANCEOF*/
//    Boolean a = true;
//    a instanceof boolean

    String texto = "Hola";
    Integer numero = 100;

    boolean textoBooleano = texto instanceof String;
    System.out.println("texto es TIPO String? = " + textoBooleano);

//    Toda clase en JAVA hereda de la clase OBJECT de manera implicita
    textoBooleano = texto instanceof Object;
    System.out.println("texto es TIPO Object? = " + textoBooleano);

    boolean numeroBooleano = numero instanceof Integer;
    System.out.println("numero es TIPO Integer? = " + numeroBooleano);

    numeroBooleano = numero instanceof Object;
    System.out.println("numero es TIPO Object? = " + numeroBooleano);

    numeroBooleano = numero instanceof Number;
    System.out.println("numero es TIPO Number? = " + numeroBooleano);

    Double numeroDecimal = 10.12;

    boolean numeroDecimalBooleano = numeroDecimal instanceof Number;
    System.out.println("numeroDecimal es TIPO Number? = " + numeroDecimalBooleano);
  }
}
