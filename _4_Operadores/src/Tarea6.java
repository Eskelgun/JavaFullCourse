import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tarea6 {

/*  Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

  Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o
  amigos usando la clase JOptionPane y método showInputDialog().

  Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
  (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)

  Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
  y con el indice cero accedemos al nombre de la persona.

  Restricción no usar loops en el desarrollo de la tarea.

  Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."*/

  public static void main(String[] args) {

    List<String> personas = new ArrayList<>();
    int i = 0;
    while (i < 3) {
      personas.add(JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:"));
      i++;
    }

    List<String> nombres = personas.stream().map(persona -> persona.split(" ")[0]).toList();
    String nombreMaximo = "";

    for (String nombre : nombres) {
      if (nombreMaximo.length() < nombre.length()) {
        nombreMaximo = nombre;
      }
    }


    System.out.println("La persona con el nombre mas largo es " + nombreMaximo);

  }
}
