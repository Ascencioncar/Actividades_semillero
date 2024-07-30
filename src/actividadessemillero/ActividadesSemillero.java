package actividadessemillero;
import java.util.Scanner;

public class ActividadesSemillero {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("¿Cuantos numeros deseas ingresar para sumar y sacar promedio? ");
    float cantidadNumeros = input.nextFloat();
        
        float suma = 0;
        
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numero = input.nextInt();
            suma+= numero;
        }
        
        float promedio = suma/cantidadNumeros;
        input.close();
        System.out.println("el promedio de los números ingresados es: " + promedio);

    }
}
