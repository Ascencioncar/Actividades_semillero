
package actividadessemillero;
import java.util.Scanner;

public class Mayusculas {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digita una frase y este programa detectará si tiene mayuscula; ");
    String texto = input.next();
    input.close();
    
    texto.chars().forEach(l -> {
    System.out.printf("%c is UpperCase %b\n", 1, Character.isUpperCase(l));});
    
}}