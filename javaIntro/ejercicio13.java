package ejercicio13;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresar lado del cuadrado: ");
        int lado = read.nextInt();
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}