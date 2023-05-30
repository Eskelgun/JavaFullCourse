public class OperadoresIncrementales {

  public static void main(String[] args) {
    int i = 1;

    /*Pre incremento*/
    System.out.println("Pre incremento");
//      i = i + 1
    int j = ++i;
    System.out.println("j = " + j);
    System.out.println("i = " + i);

    System.out.println("- - - - - - - - - - - - -");

    /*Post incremento*/
    System.out.println("Post incremento");
    i = 1;
    int k = i++;
    System.out.println("k = " + k);
    System.out.println("i = " + i);

    System.out.println("- - - - - - - - - - - - -");

    /*Pre decremento*/
    System.out.println("Pre decremento");
    i = 1;
    int x = --i;
    System.out.println("x = " + x);
    System.out.println("i = " + i);

    System.out.println("- - - - - - - - - - - - -");

    /*post decremento*/
    System.out.println("post decremento");
    i = 1;
    int y = i--;
    System.out.println("y = " + y);
    System.out.println("i = " + i);

    System.out.println("(++y) = " + (++y));
    System.out.println("(y++) = " + (y++));

    System.out.println("y = " + y);

  }
}
