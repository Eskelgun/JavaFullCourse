public class OperadoresAsignacion {

  public static void main(String[] args) {
    int i = 1;
    int j = i + 4;

//    Equivale a lo de abajo
//    i = i + 3;
    i += 3;
    System.out.println("i = " + i);
    System.out.println("j = " + j);

    i += 10;
    System.out.println("i = " + i);

    //    Equivale a lo de abajo
//    i = i - 10;
    i -= 10;
    System.out.println("i = " + i);

//    Se les conoce com operadores compuestos, estás utilizando el operador
//            matematico y de asignacion (SE PUEDE USAR TODOS LOS OPERADORES MATEMATICOS)

    i *= 4;
    System.out.println("i = " + i);

    i /= 4;
    System.out.println("i = " + i);
    
    String sqlString = "select * from clientes as cli";
    sqlString += " where cli.id = 1";
    System.out.println("sqlString = " + sqlString);

  }
}
