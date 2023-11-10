public class PrimitivosCaracteres {

  public static void main(String[] args) {

    /*https://www.ssec.wisc.edu/~tomw/java/unicode.html*/
//    Se representan los caracteres con el unicode del SO o su valor decimal 

    char caracterUnicode = '\u0040';
    System.out.println("caracterUnicode = " + caracterUnicode);

    char decimal = 257;
    System.out.println("decimal = " + decimal);

    System.out.println("Tipo char corresponde en Bytes a " + Character.BYTES);
    System.out.println("Tipo char corresponde en Bites a " + Character.SIZE);
    System.out.println("Valor máximo de un char es " + Character.MAX_VALUE);
    System.out.println("Valor mínimo de un char es " + Character.MIN_VALUE);

//    Caracteres especiales
    char eliminarCaracter = '\b';
    System.out.println("eliminarCaracter-123"+eliminarCaracter);

    char tabulador = '\t';
    System.out.println("tabulador-12 \t 3"+tabulador);

    char nuevaLinea =  '\n';
    System.out.println("nuevaLinea-123"+nuevaLinea+321);

//    Borra T0D0 sobre el renglon parado si hay caracteres al lado derecho del 'retorno carro'
    char retornoCarro = '\r';
    System.out.println("retornoCarro-123"+nuevaLinea+retornoCarro+"abc");

//    El salto de linea depende del SO, pero usamos esta opcion si tenemos duda ya que es una
//            variable de la maquina virutal de JAVA (el entorno)
    System.out.println("saltoLinea_Java-123"+ System.getProperty("line.separator")+321);
    System.out.println("saltoLinea_Java2-123"+ System.lineSeparator()+321);

  }
}
