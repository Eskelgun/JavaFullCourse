import java.util.ArrayList;
import java.util.Date;

public class PrimitivosNumerosDecimales {

  public static void main(String[] args) {

//    Si agregamos el punto . la literal cambia double y saca error. Debemos agregar la letra F
//    float numeroRealFloat = 1.0;

    float numeroRealFloat = 1.0F;
    System.out.println("numeroRealFloat = " + numeroRealFloat);


    System.out.println("- - - - - - - - - - - - - - - - - - - -");

    float numeroRealFloat2 = 2530F;
//    E o e significa EXPONENTE = 10^valor
    float numeroRealFloat3 = 2.530E3F;
    System.out.println("numeroRealFloat2 = " + numeroRealFloat2);
    System.out.println("numeroRealFloat3 = " + numeroRealFloat3);


    System.out.println("- - - - - - - - - - - - - - - - - - - -");


//    Desde e +-5 se escribirá en notación cientifica
    float numeroRealFloat4 = 21E-5F; //0.00021F
    float numeroRealFloat5 = 0.00021F;
    System.out.println("numeroRealFloat4 = " + numeroRealFloat4);
    System.out.println("numeroRealFloat5 = " + numeroRealFloat5);


    System.out.println("- - - - - - - - - - - - - - - - - - - -");

//    La precisión es de 6-7 digitos decimales (7 posición cambia)
    float numeroFloat = 1.23456789F;
    System.out.println("numeroFloat = " + numeroFloat);
    System.out.println("Tipo Float corresponde en Bytes a " + Float.BYTES);
    System.out.println("Tipo Float corresponde en Bites a " + Float.SIZE);
    System.out.println("Valor máximo de un Float es " + Float.MAX_VALUE);
    System.out.println("Valor mínimo de un Float es " + Float.MIN_VALUE);

    System.out.println("- - - - - - - - - - - - - - - - - - - -");

//    Al agregar el punto '.' en la literal se vuelve de tipo double}
//    La precisión es de 14-16 digitos decimales (15-16 posición cambian)
    double numeroDouble = 1.12345678912345678;
    System.out.println("numeroDouble = " + numeroDouble);
    System.out.println("Tipo Double corresponde en Bytes a " + Double.BYTES);
    System.out.println("Tipo Double corresponde en Bites a " + Double.SIZE);
    System.out.println("Valor máximo de un Double es " + Double.MAX_VALUE);
    System.out.println("Valor mínimo de un Double es " + Double.MIN_VALUE);




  }
}
