public class EjemploString {

  public static void main(String[] args) {
    String curso = "Java";
    String curso2 = "Java";
    String cursoPrincipal = new String("Java");

    boolean sonIgual = curso == cursoPrincipal;
    System.out.println("curso == cursoPrincipal = " + sonIgual);
    
    sonIgual = curso.equals(cursoPrincipal);
    System.out.println("curso.equals(cursoPrincipal) = " + sonIgual);

/*    Al no instanciar la variable 'Curso2' con un new, 'Curso2' apunta a 'Curso'*/
//    boolean sonIguales = curso == curso2;
//    System.out.println("curso.hashCode() = " + curso.hashCode() + " curso2.hashCode() = " + curso2.hashCode());
//    System.out.println("sonIguales (curso == curso2) = " + sonIguales);

    String curso3 = "Java"; 
    sonIgual = curso == curso3;
    System.out.println("curso == curso3 = " + sonIgual);


  }


}
