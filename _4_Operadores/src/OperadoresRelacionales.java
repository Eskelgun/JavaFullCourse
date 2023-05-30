public class OperadoresRelacionales {

  public static void main(String[] args) {
    int i = 5;
    byte j = 10;
    float k = 127e-7F;
    double d = 2.1415e5;
    boolean f = false;

//    Operador de asignación
//            =

//    Operador de igualdad, se utiliza para valores y no para OBJETOS
    boolean valorBooleano = i == j;
    System.out.println("valorBooleano = " + valorBooleano);

//    Operador de negación
    boolean valorBooleano2 = !valorBooleano;
    System.out.println("valorBooleano2 = " + valorBooleano2);

//    Operador diferente o distinto
    boolean valorBooleano3 = i != j;
    System.out.println("valorBooleano3 = " + valorBooleano3);

    boolean valorBooleano4 = f == true;
    System.out.println("valorBooleano4 = " + valorBooleano4);

    boolean valorBooleano5 = f != true;
    System.out.println("valorBooleano5 = " + valorBooleano5);

//    Operador Mayor que
    boolean valorBooleano6 = i > j;
    System.out.println("valorBooleano6 = " + valorBooleano6);

//    Operador Mayor o igual que
    boolean valorBooleano7 = i >= j;
    System.out.println("valorBooleano7 = " + valorBooleano7);

//    Operador Menor que
    boolean valorBooleano8 = i < j;
    System.out.println("valorBooleano8 = " + valorBooleano8);

//    Operador Menor o igual que
    boolean valorBooleano9 = i < j;
    System.out.println("valorBooleano9 = " + valorBooleano9);

    System.out.println("d = " + d);
    System.out.println("k = " + k);
    System.out.println("(d > k) = " + (d > k));

  }
}
