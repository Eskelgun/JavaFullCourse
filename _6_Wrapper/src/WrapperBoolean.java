public class WrapperBoolean {
  public static void main(String[] args) {

    Integer num1, num2;
    num1 = 1;
    num2 = 2;

    boolean primitivoBooleano = num1 > num2;
    Boolean ObjetoBoolean = false;
    Boolean ObjetoBoolean2 = Boolean.valueOf("True");

    System.out.println("primitivoBooleano = " + primitivoBooleano);
    System.out.println("ObjetoBoolean = " + ObjetoBoolean);
    System.out.println("ObjetoBoolean2 = " + ObjetoBoolean2);

    System.out.println("Comparando dos Objetos Boolean: " + (ObjetoBoolean == ObjetoBoolean2));
    System.out.println("Comparando dos Objetos Boolean: " + (ObjetoBoolean.equals(ObjetoBoolean2)));

  }
}
