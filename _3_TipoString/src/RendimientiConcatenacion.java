public class RendimientiConcatenacion {

  public static void main(String[] args) {

    String nombre = "David";
    String nombre2= "Alejandro";
    String apellido = "Garrido";
    String apellido2 = "Benavides";

    StringBuilder stringBuilder = new StringBuilder();
    StringBuffer stringBuffer = new StringBuffer();
    long inicio = System.currentTimeMillis();
    
    for(int i = 0; i < 1000; i++){
//      22ms
//      nombre = nombre + nombre2 + apellido + apellido2;

//      16ms
//      nombre = nombre.concat(nombre2).concat(apellido).concat(apellido2);

//      1ms
//      stringBuilder.append(nombre).append(nombre2).append(apellido).append(apellido2);

    }
    
    long fin = System.currentTimeMillis();

    long resultadoTiempo = fin - inicio;
    System.out.println("resultadoTiempo = " + resultadoTiempo + "ms");

  }
}
