import java.util.Scanner;

public class Tarea8 {

/*  Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
  Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y
  la cantidad de notas 1, ademas mostrar el promedio total.

  Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir
  las notas una a una para realizar los cálculos (contadores, sumas).

  Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for
  y mostrar un mensaje de error finalizando el programa.*/

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese 20 notas finales en una escala de 1 al 7, puede incluir decimales");
    double[] notas = new double[20];
    for (int i = 0; i < notas.length; i++) {
      notas[i] = scanner.nextDouble();
      if (notas[i] <= 0 || notas[i] > 7) {
        System.err.println("El siguiente valor como nota no es valido: " + notas[i]);
        return;
      }
    }

    int cantidadNotasSuperior = 0;
    int cantidadNotasMedio = 0;
    int cantidadNotasBaja = 0;

    double valorNotasSuperior = 0;
    double valorNotasMedio = 0;
    double valorNotasBaja = 0;
    double valorNotasTotal = 0;

    for (double nota : notas) {
      valorNotasTotal += nota;

      if (nota >= 5) {
        valorNotasSuperior += nota;
        cantidadNotasSuperior++;
      } else if (nota < 5 && nota > 1) {
        valorNotasMedio += nota;
        cantidadNotasMedio++;
      } else {
        valorNotasBaja += nota;
        cantidadNotasBaja++;
      }
    }

    if (cantidadNotasSuperior == 0) {
      System.out.println("No hay notas superiores a 5");
    } else {
      System.out.println("Promedio de notas superiores a 5 es: " + (valorNotasSuperior / cantidadNotasSuperior));
    }

    if (cantidadNotasMedio == 0) {
      System.out.println("No hay notas superiores a 1");
    } else {
      System.out.println("Promedio de notas superiores a 1 es: " + (valorNotasMedio / cantidadNotasMedio));
    }

    if (cantidadNotasBaja == 0) {
      System.out.println("No hay notas inferiores a 1");
    } else {
      System.out.println("Promedio de notas inferiores a 1 es: " + (valorNotasBaja / cantidadNotasBaja));
    }

    System.out.println("El promedio total de las notas es : " + (valorNotasTotal / notas.length));

  }
}
