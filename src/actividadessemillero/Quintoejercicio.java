package actividadessemillero;

import java.util.Scanner;

public class Quintoejercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita una cadena de caracteres: ");
        String cadena = input.nextLine();
        input.close();

        if (verificarCadena(cadena)) {
            System.out.println("La cadena cumple con los requisitos.");
        } else {
            System.out.println("La cadena no cumple con los requisitos.");
        }
    }

    public static boolean verificarCadena(String cadena) {
        boolean tieneNumero = false;
        boolean tieneLetra = false;
        
        if (cadena.length() < 8) {
            return false;
        }
        else {
        for (char c : cadena.toCharArray()) {
            if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (Character.isLetter(c)) {
                tieneLetra = true;
            }
            if (tieneNumero && tieneLetra) {
                return true;
            }
        }

        return false;
    }
}
}
