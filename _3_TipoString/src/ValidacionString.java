public class ValidacionString {

  public static void main(String[] args) {
    
    String stringPrueba = null;
    
    boolean esNull = stringPrueba == null;
    System.out.println("esNull = " + esNull);

    if(!esNull){
      System.out.println("stringPrueba = " + stringPrueba.toUpperCase());
    }

//    System.out.println(stringPrueba.concat("Hola - "));
//    System.out.println("Hola - ".concat(stringPrueba));
    System.out.println("Hola - " + stringPrueba);

    if(esNull){
      stringPrueba = "";
    }
    System.out.println(stringPrueba.concat("Hola - "));
    System.out.println("Hola - ".concat(stringPrueba));
    System.out.println("Hola - " + stringPrueba);

    boolean esVacio = stringPrueba.isEmpty();
    System.out.println("esVacio = " + esVacio);
    
    if(!esVacio){
      System.out.println(stringPrueba + " eyyyyyy");
    }

    stringPrueba = " ";

//    isEmpty() valida únicamente "", que no tenga caracteres y el length de la cadena sea CERO 0     (JAVA 6)
    esVacio = stringPrueba.isEmpty();
    System.out.println("esVacio = " + esVacio);
    
    if(!esVacio){
      System.out.println(stringPrueba + "- eyyyyyy");
    }

//    isBlank() valida que no tenga únicamente espacios vacíos "     "       (JAVA 11)
    boolean esBlanco = stringPrueba.isBlank();
    System.out.println("esBlanco = " + esBlanco);

    stringPrueba = "       @";
    esBlanco = stringPrueba.isBlank();
    System.out.println("esBlanco = " + esBlanco);
    if(!esBlanco){
      System.out.println(stringPrueba);
    }

  }
}
