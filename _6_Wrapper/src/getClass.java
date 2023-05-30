import java.lang.reflect.Method;

public class getClass {
  public static void main(String[] args) {

    String texto = "Hola";
    Class claseString = texto.getClass();
    System.out.println("claseString.getName() = " + claseString.getName());
    System.out.println("claseString.getSimpleName() = " + claseString.getSimpleName());
    System.out.println("claseString.getPackageName() = " + claseString.getPackageName());
    System.out.println("claseString = " + claseString);

    for (Method metodo : claseString.getMethods()) {
      System.out.println("metodo.getName() = " + metodo.getName());
    }

    Integer numero = 2;
    Class claseInteger = numero.getClass();
    System.out.println("claseInteger.getPackage() = " + claseInteger.getPackage());
    System.out.println("claseInteger.getSuperclass() = " + claseInteger.getSuperclass());

  }
}
