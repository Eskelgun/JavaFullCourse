public class Inmutabilidad {

  public static void main(String[] args) {

//    Los Strings son inmutables y se crean nuevas instancias al modificarlos

    String nombre = "David";
    String apellido = "Garrido";

    String fullName = nombre.concat(apellido);
    System.out.println("nombre: " + nombre);
    System.out.println("fullName = " + fullName);

     fullName = nombre.transform(n -> {
      return " " + n + " " + apellido + " ";
    });

    System.out.println("nombre: " + nombre);
    System.out.println("fullName = " + fullName);

    String fullName2 = fullName.replace(' ','-');
    System.out.println("fullName = " + fullName);
    System.out.println("fullName2 = " + fullName2);

  }
}
