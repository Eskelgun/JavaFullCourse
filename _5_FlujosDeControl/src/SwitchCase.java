public class SwitchCase {

  public static void main(String[] args) {
/*    Es compatible con los siguientes tipo de valores:
    char, byte, short, int, Character, Byte, Short, Integer, String y  enum*/

//    Es switch es capaz de ejecutar en cascada, por eso se sugiere el uso
//    del break. Ej: Si el case #2 se ejecuta, se ejecutará el case #2 hasta el último case.
    int num = 11;
    switch (num) {
      case 0:
        System.out.println("Case 0");
        break;
      case 1:
        System.out.println("Case 1");
        break;
      case 2:
        System.out.println("Case 2");
        break;
      default:
        System.out.println("Case default");
    }

  }
}
