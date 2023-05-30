public class CalcularNumeroDias {

  public static void main(String[] args) {

    int mes = 2;
    int numeroDias = -1;
    int year = 2020;

    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
      numeroDias = 31;
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      numeroDias = 30;
    } else if (mes == 2) {
      if (year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0)) {
        numeroDias = 29;
      } else
        numeroDias = 28;
    }

    System.out.println(numeroDias);

  }
}
