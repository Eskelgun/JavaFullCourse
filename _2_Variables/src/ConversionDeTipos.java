public class ConversionDeTipos {

  public static void main(String[] args) {

//    DE STRING A OTRO TIPO

    String numeroString = "10";
    int numeroInt = Integer.parseInt(numeroString);
    System.out.println("numeroInt = " + numeroInt);
    
    String numeroRealString = "123.45e-2";
    double realDouble = Double.parseDouble(numeroRealString);
    System.out.println("realDouble = " + realDouble);

    String booleanTrueString = "TrUe";
    boolean booleanoTrue = Boolean.parseBoolean(booleanTrueString);
    System.out.println("booleanoTrue = " + booleanoTrue);

    String booleanFalseString = "FALse";
    boolean booleanoFalse= Boolean.parseBoolean(booleanFalseString);
    System.out.println("booleanoFalse = " + booleanoFalse);

//    DE OTRO TIPO A STRING
    int numeroEntero = 10;
    String stringNumEntero = Integer.toString(numeroEntero);
    System.out.println("stringNumEntero = " + stringNumEntero);

    int numEntero = 20;
    String strNumeroEntero = String.valueOf(numEntero + 10);
    System.out.println("strNumeroEntero = " + strNumeroEntero);
    strNumeroEntero = String.valueOf(stringNumEntero + 20);
    System.out.println("strNumeroEntero = " + strNumeroEntero);
    
    double doubleReal = 1.234e2;
    String stringNumReal = Double.toString(doubleReal);
    System.out.println("stringNumReal = " + stringNumReal);
    stringNumReal = String.valueOf(0.123e1F);
    System.out.println("stringNumReal = " + stringNumReal);

//    DE UN TIPO A OTRO TIPO
    
/*    EXPERIMENTO RARO (LOS LIMITES DEL RANGO DE LOS TIPOS NUMERICOS
    SON COMO LISTAS ENLANZADAS) */
    int a = 32765;
    while (a != 32775){
      short i = (short) a;
      System.out.println("i = " + i);
      a++;
    }
    System.out.println("- - - FIN - - -");

    int i = 3423;
    short s = (short) i;
    System.out.println("s = " + s);
    long l = i;
    System.out.println("l = " + l);

/*    casteo no compatible */
//    boolean b = (boolean) i;

    char c = (char) i;
    System.out.println("c = " + c);

    float f = (float) i;
    System.out.println("f = " + f);

//    Se facilita le casteo entre tipos primitivos que tengan similitud

  }
}
