public class OperadoresLogicos {

  public static void main(String[] args) {

    int i = 1;
    int j = 2;
    int i2 = 1;
    int h = 1000;
    boolean isTrue = true;
    boolean isFalse = false;

//    Operador AND && (Las dos condiciones deben ser iguales; TRUE o FALSE y ambas son evaluadas para
//    determinar el valor)
    boolean valorBooleano = i + j > 0 && isTrue == true;
    System.out.println("valorBooleano = " + valorBooleano);

    boolean valorBooleano2 = i + j > 0 && isTrue == false;
    System.out.println("valorBooleano2 = " + valorBooleano2);

//    Operador OR || (Si la primera condicion evaluada es TRUE dará TRUE como resultado,
//    de caso contrario se evaluará la segunda condición, si esta segubda es TRUE retorna TRUE
//    si AMBAS condiciones son FALSE el resultado es FALSE)

    boolean valorBooleano3 = i + j > 0 || isTrue == false;
    System.out.println("valorBooleano3 = " + valorBooleano3);

    boolean valorBooleano4 = i + j > 100 || isTrue == true;
    System.out.println("valorBooleano4 = " + valorBooleano4);

    boolean valorBooleano5 = i + j > 100 || isTrue == false;
    System.out.println("valorBooleano5 = " + valorBooleano5);

    /*Combinando*/
    boolean valorBooleano6 = i + j > 0 && (isTrue == false || isFalse == false);
    System.out.println("valorBooleano6 = " + valorBooleano6);

    boolean valorBooleano7 = (isTrue == false && isFalse == true) || i + j > 0;
    System.out.println("valorBooleano7 = " + valorBooleano7);

    boolean valorBooleano8 = isTrue == false || isFalse == true || i + j > 100;
    System.out.println("valorBooleano8 = " + valorBooleano8);

    boolean valorBooleano9 = isTrue == false && isFalse == true && i + j > 100;
    System.out.println("valorBooleano9 = " + valorBooleano9);

//    Ejemplos avanzados

//    Primero como prioridad resuelve el AND && y luego el OR ||
    boolean valorBooleano10 = i == i2 || h > 10 && isFalse == true;
    System.out.println("valorBooleano10 = " + valorBooleano10);

//    Por uso de los parentesis de prioridad al OR ||
    boolean valorBooleano11 = (i == i2 || h > 10) && isFalse == true;
    System.out.println("valorBooleano11 = " + valorBooleano11);

    boolean valorBooleano12 = true || true && false;
    System.out.println("valorBooleano12 = " + valorBooleano12);

    boolean valorBooleano13 = (true || true) && false;
    System.out.println("valorBooleano13 = " + valorBooleano13);

//    AND luego OR y OR
    boolean valorBooleano14 = true || false && false || false;
    System.out.println("valorBooleano14 = " + valorBooleano14);

//    OR luego AND y OR
    boolean valorBooleano15 = ((true || false) && false) || false;
    System.out.println("valorBooleano15 = " + valorBooleano15);

  }
}
