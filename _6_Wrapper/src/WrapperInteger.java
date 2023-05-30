public class WrapperInteger {

  public static void main(String[] args) {

    /*Generando una instancia Integer*/
    int valorPrimitivo = 32769;

//    Explicita
    Integer numero = Integer.valueOf(valorPrimitivo);
    System.out.println(numero);

//    Autoboxing - Implicita
    Integer numero2 = 4;
    System.out.println("numero2 = " + numero2);


//    Asignando Integer a valor primitivo
    valorPrimitivo = numero2;
    valorPrimitivo = numero2.intValue();
    System.out.println("numero2 = " + numero2);


    String valor = "1000";
    Integer valorNumerico = Integer.valueOf(valor);
    System.out.println("valorNumerico = " + valorNumerico);


//    Perdida o inconsistencia de informacion
    Short shortValue = numero.shortValue();
    System.out.println("shortValue = " + shortValue);

//    El autoboxing no soporta este valor porque se sale del limite soportada
//    shortValue = 32768;


  }
}
