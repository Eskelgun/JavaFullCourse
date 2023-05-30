import javax.swing.*;

public class OperadoresAritmetico {

  public static void main(String[] args) {

    int i = 1, j = 4, suma = i + j;
    System.out.println("suma = " + suma);

    /*Se evalua de IZQUIERDA a DERECHA el 'i' pasa a ser un String
    y no se puede sumar con el 'j' porque ya fue concatenado
    con el String del lado IZQUIERDO, por ende el resultado concatena 14
    i = 1 j = 4*/
    System.out.println("i + j = " + i + j);

//    Escenarios de cómo evitar lo anterior
    System.out.println(i + j + " es i + j");
    System.out.println("i + j = " + (i + j));

    int resta = i - j;
    System.out.println("resta = " + resta);

    /*Marca error porque no se puede 'restar' la 'i' con la 'j'
    al ser transformado en un valor String primero*/
//    System.out.println("i - j = " + i - j);
    System.out.println("i - j = " + (i - j));

    int multiplicacion = i * j;
    System.out.println("multiplicación = " + multiplicacion);


    /*El resultado con decimales da 1.857, pero al ser int las variables
    se queda con la parte entera del resultado*/
    int a = 7, b = 13, division = b / a;
    System.out.println("division = " + division);

    /*Se pueden castear los 2 valores,pero con 1 basta*/
    float division2 = (float) a / (float) b;
    System.out.println("division2 = " + division2);

    float division3 = (float) a / b;
    System.out.println("division3 = " + division3);

    /*El número 5 cabe 5 veces en el 27 (5 * 5 = 25) por ende el modulo o sobrante es 2*/
    int modulo = 27 % 5;
    System.out.println("modulo = " + modulo);

    /*Para saber si un número es par se hace modulo con 2*/
    int numeroEspar = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
    if (numeroEspar % 2 == 0) {
      System.out.println("Es par = " + numeroEspar);
    } else {
      System.out.println("No es par = " + numeroEspar);
    }


//    Precedencia, primero * / luego + -
    int totalSegunPrecedencia = 10 + 8 / 2;
    System.out.println("totalSegunPrecedencia = " + totalSegunPrecedencia);

    totalSegunPrecedencia = (10 + 8) / 2;
    System.out.println("totalSegunPrecedencia = " + totalSegunPrecedencia);

  }
}
