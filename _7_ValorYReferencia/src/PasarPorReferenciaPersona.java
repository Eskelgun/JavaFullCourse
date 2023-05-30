public class PasarPorReferenciaPersona {

  public static void main(String[] args) {

    Persona persona = new Persona();
    System.out.println("persona INICIAL = " + persona);
    test(persona);
    System.out.println("persona FINAL = " + persona);

  }

  /*Si pasamos esta referencia de Objeto y modificamos el valor de alguno de sus atributos,
  estos cambios afectarán directamente a la instancia original*/
  public static void test(Persona p) {

    p.nombre = "DAGB";
    p.edad = 24;
    p.celular = 11111111;

  }

/*  public static void test(Persona p) {

    p.setNombre("DAGB");
    p.setEdad(24);
    p.setCelular(11111111);

  }*/
}

class Persona {

  String nombre = "Pepito";
  Integer edad = 99;
  int celular = 00000;

//  private String nombre = "Pepito";
//  private Integer edad = 99;
//  private int celular = 00000;

  @Override
  public String toString() {
    return "Persona{" +
            "nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", celular=" + celular +
            '}';
  }

//  public String getNombre() {
//    return nombre;
//  }
//
//  public Integer getEdad() {
//    return edad;
//  }
//
//  public int getCelular() {
//    return celular;
//  }
//
//  public void setNombre(String nombre) {
//    this.nombre = nombre;
//  }
//
//  public void setEdad(Integer edad) {
//    this.edad = edad;
//  }
//
//  public void setCelular(int celular) {
//    this.celular = celular;
//  }
}
