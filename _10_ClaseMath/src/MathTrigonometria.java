public class MathTrigonometria {

  public static void main(String[] args) {

    double valor = 90.0;
    double grados = Math.toDegrees(valor);
    System.out.println("Radianes > Grados = " + grados);
    
    double radianes = Math.toRadians(valor);
    System.out.println("Grados > Radianes = " + radianes);

    System.out.println("Sen = " + Math.sin(radianes));
    System.out.println("Cos = " + Math.cos(radianes));
    System.out.println("Tan = " + Math.tan(radianes));

  }
}
