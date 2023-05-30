public class IfElse {

  public static void main(String[] args) {

    float promedio = 5.6f;

//    El if es valido si la sentencia dentro es TRUE
    if (promedio > 6) {
      System.out.print("Buen promedio ");
    } else {
      System.out.print("Puedes mejorar en tu promedio ");
    }
    System.out.println(promedio);
//    El else es la sentencia de codigo alternativa si el IF no se cumple
//    (En este caso sólo una de las dos sentencias se ejecutará, jamas las dos)


    float promedio2 = 8.2f;

//    En la sentencia con uno o más ELSE IF, sólo se ejecutará la primera sentencia
//    que cumpla la condición y las de más no serán evaluadas
    if (promedio2 > 6) {
      System.out.print("Buen promedio ");
    } else if (promedio2 > 4){
      System.out.print("Puedes mejorar en tu promedio ");
    }else if (promedio2 > 2){
      System.out.print("Perderas el año, avispate ");
    }else {
      System.out.print("Ya valiste, perderás sin remedio ");
    }
    System.out.println(promedio2);

  }
}
