public class AutoboxingInteger {

  public static void main(String[] args) {

    Integer[] enteros = {1, 2, 3, 4, 5};

    int suma = 0;
//    Unboxing - Esto realiza la maquina virtual de Java cuando se realizan operaciones
//    matematicas con valores numericos (Autounboxing)
    for (Integer numero : enteros) {
      if (numero.intValue() % 2 == 0) {
        suma += numero.intValue();
      }
    }
    System.out.println("suma de pares = " + suma);

    Integer num1 = 5;
    Integer num2 = 10;

    Integer resultado = num1 + num2;

    /*Implicitamente java realiza esta operación para operar matematicamente con los valores de
    * los Objetos Number*/
//    resultado = num1.intValue() + num2.intValue();
    System.out.println("resultado = " + resultado);

  }
}
