package ejercicio3;
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresar una frase: ");
        String frase = read.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
    }

}