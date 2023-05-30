public class PasarPorValor {

  public static void main(String[] args) {

    int i = 10;
    Integer j = 15;
    System.out.println("i INICIAL = " + i);
    System.out.println("j INICIAL = " + j);

    test(i, j);

    System.out.println("i FINAL = " + i);
    System.out.println("j FINAL = " + j);

  }

  /*Cuando pasamos una referencia de un Objeto; en este caso Integer
  * al cambiar su valor dentro del metodo se crea una nueva instancia
  * porque es inmutable la clase de tipo Integer, Double... String
  * (Los WRAPPER son INMUTABLES)*/
  public static void test(int valor, Integer numero){
    System.out.println("valor = " + valor);
    valor = 20;
    numero = 20;
    System.out.println("valor = " + valor);
  }

}
