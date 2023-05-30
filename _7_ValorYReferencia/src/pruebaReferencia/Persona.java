package pruebaReferencia;

public class Persona {

  String nombre = "Pepito";
  Integer edad = 99;
  int celular = 00000;

  @Override
  public String toString() {
    return "Persona{" +
            "nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", celular=" + celular +
            '}';
  }
}
