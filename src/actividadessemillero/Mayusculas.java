package actividadessemillero;
import java.util.Scanner;

public class Mayusculas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita una frase y este programa detectará si tiene mayúsculas:");
        String texto = input.nextLine(); // Cambié next() a nextLine() para leer toda la frase
        input.close();

        boolean tieneMayuscula = false;
        for (char c : texto.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
                break;
            }
        }

        if (tieneMayuscula) {
            System.out.println("La frase contiene mayúsculas.");
        } else {
            System.out.println("La frase no contiene mayúsculas.");
        }
    }
}
