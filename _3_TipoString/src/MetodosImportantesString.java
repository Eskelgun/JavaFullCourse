public class MetodosImportantesString {

  public static void main(String[] args) {
    
    String nombre = "David";

    System.out.println("nombre.length() = " + nombre.length());
    
    System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
    System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
    
    System.out.println("nombre.equals(\"david\") = " + nombre.equals("david"));
    System.out.println("nombre.equals(\"David\") = " + nombre.equals("David"));
    System.out.println("nombre.equalsIgnoreCase(\"david\") = " + nombre.equalsIgnoreCase("david"));

//    Compara los caracteres según el lexicografico del Unicode (El orden númerico de la tabla unicode)
//    Si es 0 son iguales
    System.out.println("nombre.compareTo(\"David\") = " + nombre.compareTo("David"));
    System.out.println("nombre.compareTo(\"david\") = " + nombre.compareTo("david"));

    System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
    System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
    System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));

    System.out.println("nombre.substring(0, 2) = " + nombre.substring(0, 2));
    System.out.println("nombre.substring(1) = " + nombre.substring(1));
    System.out.println("nombre.substring(2, nombre.length()) = " + nombre.substring(2, nombre.length()));

    String trabalengua = "trabalengua";
    System.out.println("trabalengua.replace('a','x') = " + trabalengua.replace('a','x'));
    System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
    System.out.println("trabalengua.indexOf(\"gua\") = " + trabalengua.indexOf("gua"));
    System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
    System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('x'));
    System.out.println("trabalengua.contains(\"gua\") = " + trabalengua.contains("gua"));
    System.out.println("trabalengua.startsWith(\"tra\") = " + trabalengua.startsWith("tra"));
    System.out.println("trabalengua.endsWith(\"ua\") = " + trabalengua.endsWith("ua"));
    System.out.println("  trabalengua     ");
    System.out.println("  trabalengua     ".trim());
    System.out.println("  traba lengua     ".trim());

    
  }
  
}
