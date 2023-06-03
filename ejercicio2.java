package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = read.nextLine();
        
        System.out.println("Bienvenid@ " + nombre + "!");
    }

}