package pruebaReferencia;

public class Main {

  public static void main(String[] args) {

    Persona p = new Persona();

    System.out.println("p INICIAL= " + p);
    ControladorPersona.modificarPersona(p);
    System.out.println("p FINAL= " + p);

  }

}
