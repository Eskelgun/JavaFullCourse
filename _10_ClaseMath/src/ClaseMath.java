public class ClaseMath {

  public static void main(String[] args) {
    
    int enteroAbsoluto = Math.abs(-51);
    System.out.println("enteroAbsoluto = " + enteroAbsoluto);
    
    enteroAbsoluto = Math.abs(3);
    System.out.println("enteroAbsoluto = " + enteroAbsoluto);
    
    double maximo = Math.max(3.5, 1.2);
    System.out.println("maximo = " + maximo);
    
    double minimo = Math.min(3.5, 1.2);
    System.out.println("minimo = " + minimo);

    double redondeoSuperior = Math.ceil(1.2);
    System.out.println("redondeoSuperior = " + redondeoSuperior);

    double redondeoInferior = Math.floor(1.2);
    System.out.println("redondeoInferior = " + redondeoInferior);

    double redondeoCercano = Math.round(4.5);
    System.out.println("redondeoCercano = " + redondeoCercano);

    redondeoCercano = Math.round(4.4);
    System.out.println("redondeoCercano = " + redondeoCercano);

    double valorExponencial = Math.exp(1);
    System.out.println("valorExponencial = " + valorExponencial);

    double logaritmoNatural = Math.log(10);
    System.out.println("logaritmoNatural = " + logaritmoNatural);
    
    double potencia = Math.pow(10, 2);
    System.out.println("potencia = " + potencia);
    
    double raiz = Math.sqrt(25);
    System.out.println("raiz = " + raiz);
  }
}
