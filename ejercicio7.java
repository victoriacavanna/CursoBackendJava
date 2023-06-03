package ejercicio7;
import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = read.nextLine();
        
        frase = frase.toLowerCase();
        
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
