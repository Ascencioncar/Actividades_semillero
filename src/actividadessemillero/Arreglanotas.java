package actividadessemillero;
import java.util.Scanner;

public class Arreglanotas {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("¿Cuantas notas vas a ingresar? ");
    float notas = input.nextFloat();
        
        float suma = 0;
        
        for (int i = 0; i < notas; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            float numero = input.nextFloat();
            suma += numero/notas;
        }
        input.close();
        if (suma>=3.0){boolean nota =true; System.out.println("Las notas sumadas: " + suma + " Ganaste!" + nota);}
        else{boolean nota =false; System.out.println("Perdiste geometría " + nota); }
}
}
