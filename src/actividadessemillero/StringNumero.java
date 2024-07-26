
package actividadessemillero;
import java.util.Scanner;

public class StringNumero {
         public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita número o letras: ");
        String cadena = input.next();
        int numero;
        input.close();
        if (isNumeric(cadena) == true) {
            numero = Integer.parseInt(cadena);
            System.out.println("El dato ingresado es el número: " + numero);
        } else {
            System.out.println( cadena +" No es un numero, Son letras " );
        }

}
}