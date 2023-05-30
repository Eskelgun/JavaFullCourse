//https://es.stackoverflow.com/questions/4258/java-admite-el-paso-de-variables-por-referencia
//https://lineadecodigo.com/java/parametros-por-referencia-en-java/
public class PruebaAlcanceScope {
  public int valor;

  public static void metodo_referencia(PruebaAlcanceScope m) {
    m.valor = 3;
  }

  public static void metodo_referencia2(PruebaAlcanceScope m) {
    PruebaAlcanceScope m3 = new PruebaAlcanceScope();
    m = m3;
    m.valor = 3;
  }
  
  public static void main(String[] args) {

    PruebaAlcanceScope m1 = new PruebaAlcanceScope();
    m1.valor = 2;
    System.out.println(m1.valor); // Devuelve 2
    metodo_referencia(m1);
    System.out.println(m1.valor); // Devuelve 3

//    -------------------------------------------

    PruebaAlcanceScope m2 = new PruebaAlcanceScope();
    m2.valor = 2;
    System.out.println(m2.valor); // Devuelve 2
    metodo_referencia2(m2);
    System.out.println(m2.valor); // Devuelve 2
    
  }
}