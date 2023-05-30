public class While_DoWhile {

  public static void main(String[] args) {

    int i = 0;
/*    La expresión while es una estructura con precondición
    para ejecutar una sentencia de codigo*/

    while (i < 5) {
      System.out.println("Sólo while " + i);
      i++;
    }

    /*La expresión do while ejecuta primero la sentencia de código
     * y luego verifica la condición, tiene una estructura postcondición.
     * Por lo menos ejecutará la sentencia de código UNA vez*/

    int y = 0;
    do {
      System.out.println("Do while " + y);
      y++;
    } while (y < 2);


  }

}
