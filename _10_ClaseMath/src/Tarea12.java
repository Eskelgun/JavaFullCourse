import java.util.Scanner;

public class Tarea12 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite el RADIO del circulo (Numero mayor a 0)");
    int radio = scanner.nextInt();

    double areaCirculo = Math.PI * Math.pow(radio, 2);
    System.out.println("Area del circulo = " + areaCirculo);


  }
}
