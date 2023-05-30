import java.util.Scanner;

public class Tarea3 {

/*  La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

  Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o
  amigos como argumentos de línea de comandos.

  Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo
  carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres
  de la persona. Por ejemplo para Andres debe quedar como N.es

  Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

  Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

  N.es_A.ia_E.pe*/

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String[] nombres = new String[3];
    int i = 0;
    while (i < nombres.length){
      System.out.println("Por favor ingrese su nombre, en la posición #" + (i + 1));
      nombres[i] = scanner.next();

      i++;
    }


    StringBuilder resultado = new StringBuilder();
    for(String nombre: nombres){
      if(nombre.length() > 2){
        resultado.append(Character.toUpperCase(nombre.charAt(0)))
                .append('.')
                .append(nombre.substring(nombre.length() - 2))
                .append('_');
      }else{
        System.out.println("El nombre: \"" + nombre + "\" tiene un formato invalido.");
      }
    }
    resultado.deleteCharAt(resultado.length() - 1);

    System.out.println("resultado = " + resultado);

  }
}
