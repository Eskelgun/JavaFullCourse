public class For {

  public static void main(String[] args) {
    String[] vocales = {"a", "e", "i", "o", "u"};

    /*for*/

//    For con incremento
    for (int i = 0; i < vocales.length; i++) {
      System.out.println(vocales[i] + " - " + i);
    }

    int x = 0;
    for (; x < vocales.length; ) {
      System.out.println(vocales[x]);
      x++;
    }

//    For con decremento
    for (int i = (vocales.length - 1); i >= 0; i--) {
      System.out.println(vocales[i] + " - " + i);
    }

//    for con incremento y decremento
    for (int i = 0, y = (vocales.length - 1);
         y >= 0 && i < vocales.length;
         i++, y--) {
      System.out.println(">> " + vocales[i] + " I: " + i);
      System.out.println("<< " + vocales[y] + " Y: " + y);
    }

    /*for each*/
    System.out.println("- - - for each - - -");
    for (String vocal : vocales) {
      System.out.println(vocal);
    }

//    continue: Es usado para salirse de la iteración actual, pero no del ciclo.
    for(int i = 0; i < 10; i++){
      if(i % 2 == 0){
        continue;
      }
      System.out.println(i);
    }

//    break: Es usado para salirse completamente del ciclo
    for(int i = 0; i < vocales.length; i++){
      if(vocales[i].equalsIgnoreCase("i")){
        break;
      }
      System.out.println(vocales[i]);
    }

  }
}
