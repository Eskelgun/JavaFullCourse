import java.util.Random;

public class ClaseRandom {

  public static void main(String[] args) {

    Random random = new Random();

    /*Numero entero entre [0 y 10]*/
    int numeroRandom = random.nextInt(11);
    System.out.println("numeroRandom = " + numeroRandom);

    numeroRandom = random.nextInt();
    System.out.println("numeroRandom = " + numeroRandom);

    /*Numero entero entre [10 y 19]*/
    numeroRandom = random.nextInt(10, 20);
    System.out.println("numeroRandom = " + numeroRandom);

  }
}
