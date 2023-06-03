public class numerosRandom {

  public static void main(String[] args) {

    /*Valor double entre [0.0 y 1.0}*/
    double random = Math.random();
    System.out.println("random = " + random);

//    Valor entre [0.0 y 5.0}
    random *= 5;
    System.out.println("random = " + random);

    double redondeo = Math.floor(random);
    System.out.println("redondeo hacia bajo = " + redondeo);

    redondeo = Math.ceil(random);
    System.out.println("redondeo hacia arriba = " + redondeo);

    String[] colores = {"Rojo", "Verde", "Azul"};
    int colorNumeroRandom = (int) (Math.random() * colores.length);
    System.out.println("colorNumeroRandom = " + colorNumeroRandom);
    String colorRandom = colores[colorNumeroRandom];
    System.out.println("colorRandom = " + colorRandom);

  }
}
