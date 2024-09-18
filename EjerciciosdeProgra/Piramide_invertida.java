
package EjerciciosdeProgra;

public class Piramide_invertida {
        public static void main(String[] args) {

        String piramide = "**********";
        int valor = piramide.length();
        for (int i = 0; i < valor; i++) {
            System.out.println(piramide);
            piramide = piramide.substring(0, piramide.length() - 1);
        }
    }

}  

