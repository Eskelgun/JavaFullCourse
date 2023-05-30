public class CiclosEtiquetas {

  public static void main(String[] args) {
    /*Etiquetar un ciclo FOR o WHILE sirve para referenciar uno de estos ciclos
     * cuando se encuentran anidados y usar un CONTINUE o BREAK de manera especifica
     * sobre alguno de estos ciclos referenciados (Si no referenciamos un ciclo y utilizamos
     * CONTINUE o BREAK este SÓLO tomará efecto sobre el scope o alcance dentro del ciclo donde
     * se encuentre)*/


    String[] vocales = {"a", "e", "i", "o", "u"};

    System.out.println("- - BREAK - -");
    for1:
    for (int i = 0; i < 5; i++) {

      for2:
      for (int j = 0; j < vocales.length; j++) {
        if (i == 3) {
          break for1;
//          break for2;
        }
        System.out.print(vocales[j] + " ");
      }
      System.out.println("- - - Iteración #" + i);
    }

    System.out.println("\n" + "- - CONTINUE - -");
    for1:
    for (int i = 0; i < 5; i++) {

      for2:
      for (int j = 0; j < vocales.length; j++) {
        if (i == 3) {
//          continue for1;
          continue for2;
        }
        System.out.print(vocales[j] + " ");
      }
      System.out.println("- - - Iteración #" + i);
    }

  }
}
