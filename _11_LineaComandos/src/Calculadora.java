public class Calculadora {

  public static void main(String[] args) {

    String menu = "Opciones: S - R - M - D (SUMAR, RESTAR, MULTIPLICAR y DIVIDIR" +
            "\n e ingresar dos números (#1 y #2)";
    System.out.println("menu = " + menu);

    if(args.length != 3){
      System.err.println("Debes ingresar 3 argumentos - Operacion, #1 y #2");
      System.exit(-1);
    }

    String operacion = args[0].toLowerCase();
    float a = Float.parseFloat(args[1]);
    float b = Float.parseFloat(args[2]);
    double resultado = 0.0;

    switch (operacion) {
      case ("s"):
        resultado = a + b;
        break;
      case ("r"):
        resultado = a - b;
        break;
      case ("m"):
        resultado = a * b;
        break;
      case ("d"):
        if (b == 0) {
          System.err.println("No se puede dividir por CERO (0)");
          System.exit(-1);
        }
        resultado = a / b;
        break;
      default:
        System.err.println("No se ha ingresado opción valida");
    }

    System.out.println("resultado de la " + operacion + " es = " + resultado);

  }
}
