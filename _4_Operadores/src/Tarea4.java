import java.util.Scanner;

public class Tarea4 {

/*  El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
  Podría ser utilizando operador ternario.*/

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el primer número");
    int a = scanner.nextInt();

    System.out.println("Ingrese el segundo número");
    int b = scanner.nextInt();

    if(a == b){
      System.out.println(a + " Son iguales " + b);
    }else if (a > b){
      System.out.println(a + " Es mayor que " + b);
    }else {
      System.out.println(b + " Es mayor que " + a);
    }

  }
}
