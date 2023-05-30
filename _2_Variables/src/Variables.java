public class Variables {

  boolean prueba;

  public boolean getPrueba(){
    return this.prueba;
  }

  public static void main(String[] args) {

    String saludar = "Hola mundo";
    System.out.println(saludar);

    System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

    int numero = 23;
    System.out.println("numero = " + numero);

    boolean valor = true;
    int numero3 = 111;
    
//    Contexto
    if(valor){
      System.out.println("numero = " + numero);

      int numero2 = 32;
      System.out.println("numero2 = " + numero2);
      
      numero3 = 222;
      System.out.println("numero3 = " + numero3);
    }
      /*La variable numero2 no existe en este contexto*/
//    System.out.println("numero2 = " + numero2);

//    El literal es el valor de la variable, en este caso 123
    var numero4 = "123";

    String nombre;
    nombre = "David";

    if(numero > 100){
      nombre = "David Garrido";

      System.out.println("nombre = " + nombre);
    }

    System.out.println("nombre = " + nombre);

//    Simbolos permitidos para variables '_ $
    int $numerito = 0;

//    TIPOS PRIMITIVOS
    /*ENTEROS*/

//    El valor por defecto de un atributo es 0

//    byte - 8 bits (-128 a 127)
    byte varByte = 10;

//    short - 16 bits (-32768 a 32767)
    short varShort = 20;

//    int - 32 bits (-2147483648 a -2147483647)
    int varInt = 40;

//    long - 64 bits (-9223372036854775808 a 9223372036854775807)
    long varLong = 80L;

    /*FLOTANTE*/
//    El valor por defecto de un atributo es 0.0

//   float precisión simple - 32 bits
    float varFloat = 3.1416F;

//   double precisión doble - 64 bits (Notación cientifica 'E' exponente = x10)
//    1.4x10^-45 a 3.4028235x10^38

    double varDouble = 4.7029235E3;

    /*CARACTER*/
//    El valor por defecto de un atributo char es u0000 == null

//    Cada caracter ocupada 16 bits
    char varChar = 'G';

//    Caracteres unicode - corresponde a '!' el '\u0021'
    char varChar2 = '\u0021';

    /*BOOLEANO*/

//    Contiene 1 bit
//    El valor por defecto de un atributo boolean es false

    boolean varTrue = true;
    boolean varFalse = false;

//    NO EXISTE NULL EN boolean
//    boolean varNull = null;

  }

}
