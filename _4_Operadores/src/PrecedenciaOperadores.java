public class PrecedenciaOperadores {

  public static void main(String[] args) {

    int a = 10;
    int b = 5;
    int c = 6;

//    El resultado debería ser 7
//    La division tiene prioridad sobre la + y -
//    a + b + (c / 3)
    double promedio = (double) a + b + c / 3;
    System.out.println("promedio = " + promedio);


    promedio = (double) (a + b + c) / 3;
    System.out.println("promedio = " + promedio);

  }
}
