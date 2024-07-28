
package actividadessemillero;


import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un número entero positivo: ");
        int numero = input.nextInt();
        input.close();

        if (numero < 0) {
            System.out.println("El número no es positivo.");
        } else {
            int cantidadDigitos = contarDigitos(numero);
            System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
        }
    }

    public static int contarDigitos(int numero) {
        // Convertimos el número a una cadena y obtenemos la longitud de la cadena
        String numeroComoCadena = String.valueOf(numero);
        return numeroComoCadena.length();
    }
}
