public class Concatenacion {

  public static void main(String[] args) {

    String nombre = "David";
    String apellido = "Garrido";

    String fullName = nombre + " " + apellido;
    System.out.println("fullName = " + fullName);

    int edadAprox = 20;
    int edadFaltante = 4;

    System.out.println(fullName + edadAprox + edadFaltante);
    System.out.println(fullName + (edadAprox + edadFaltante));
    System.out.println(edadAprox + edadFaltante + fullName);

    String fullName2 = nombre.concat(" ".concat(apellido));
    fullName2 = nombre.concat(" ").concat(apellido);
    System.out.println("fullName2 = " + fullName2);

  }
}
