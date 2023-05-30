import java.util.Scanner;

public class OperadorTernario {

  public static void main(String[] args) {

    /*Los valores de retorno deben ser del mismo tipo*/
//    variable = (condicion) ? "esTrue" : "esFalse";

    String valor = (1 + 2 == 3) ? "Sí es 3" : "Error en la matrix";
    System.out.println("valor = " + valor);

    String estado = "";
    double promedioTotal = 3.2;

    /*IF Ternario*/
    estado = (promedioTotal >= 5.49) ? "Aprobado" : "Reprobrado";
    System.out.println("estado = " + estado);

    /*IF - ELSE Normal*/
//    if(promedioTotal >= 5.49){
//      estado = "Aprobado";
//    }else {
//      estado = "Reprobrado";
//    }



  }
}
