public class PruebaContadorCaracteres {

  //mitocode
  //m=1, i=1, t=1, o=2, c=1, d=1, e=1
  private void m3CountCharacterTimes(String text) {
    int i, lenght;
    int counter[] = new int[256];

    lenght = text.length();

    for (i = 0; i < lenght; i++) {
      counter[text.charAt(i)]++;
    }

    for (i = 0; i < counter.length; i++) {
      if (counter[i] != 0) {
        System.out.println((char) i + ": " + counter[i]);
      }
    }
  }

  public static void main(String[] args) {
    PruebaContadorCaracteres prueba = new PruebaContadorCaracteres();

    prueba.m3CountCharacterTimes("mitocode");
  }
}
