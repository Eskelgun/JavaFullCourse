public class PasarPorReferencia {

  public static void main(String[] args) {

    int[] numeros = {11, 22, 33, 44, 55};
    System.out.println("numeros INICIAL = " + recorrido(numeros));
    test(numeros);
    System.out.println("numeros FINAL = " + recorrido(numeros));

  }

  public static void test(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
      arreglo[i] = (i + 1);
    }
  }

  public static String recorrido(int[] arreglo) {
    StringBuilder respuesta = new StringBuilder();
    for (int j : arreglo) {
      respuesta.append(j).append(" ");
    }
    return respuesta.toString();
  }
}
